package br.com.lucassalesmoreira.fakebank.services.implementations

import br.com.lucassalesmoreira.fakebank.models.dto.PixDTO
import br.com.lucassalesmoreira.fakebank.models.dto.PixOperationResultDTO
import br.com.lucassalesmoreira.fakebank.models.entity.PixEntity
import br.com.lucassalesmoreira.fakebank.repositorys.IPixRepository
import br.com.lucassalesmoreira.fakebank.services.IPixService
import br.com.lucassalesmoreira.fakebank.services.IUserService
import org.springframework.stereotype.Service

@Service
class PixServiceImpl(
    var iPixRepository: IPixRepository,
    var iUserService: IUserService
): IPixService {
    override fun sendPix(pixDTO: PixDTO): PixOperationResultDTO {
        var senderUser = iUserService.findById(pixDTO.senderId)
        var recipientUser = iUserService.findById(pixDTO.recipientId)

        // Verifica o saldo do remetente do pix
        if (senderUser.money!! >= pixDTO.value) {
            val pixEntity: PixEntity = iPixRepository.save(PixEntity(
                sender = senderUser,
                recipient = recipientUser,
                value = pixDTO.value
            ))
            // Subtrai valor do pix da conta do remetente
            iUserService.subtractMoney(senderUser.id!!, pixEntity.value)
            iUserService.addMoney(recipientUser.id!!, pixEntity.value)

            return PixOperationResultDTO(operationResult = true, pixId = pixEntity.id)
        }

        return PixOperationResultDTO(operationResult = false, pixId = "")
    }

    override fun findById(id: String): PixEntity {
        return iPixRepository.findAllById(listOf(id)).first()
    }
}