package br.com.lucassalesmoreira.fakebank.services

import br.com.lucassalesmoreira.fakebank.models.dto.PixDTO
import br.com.lucassalesmoreira.fakebank.models.dto.PixOperationResultDTO
import br.com.lucassalesmoreira.fakebank.models.entity.PixEntity
import org.springframework.stereotype.Service

@Service
interface IPixService {
    /**
     * Realiza transação via pix.
     * @param pixDTO: PixDTO
     * @return PixOperationResultDTO
     */
    fun sendPix(pixDTO: PixDTO): PixOperationResultDTO

    /**
     * Retorna um pix pelo ID.
     * @param pixId: String
     * @return PixEntity
     */
    fun findById(pixId: String): PixEntity
}