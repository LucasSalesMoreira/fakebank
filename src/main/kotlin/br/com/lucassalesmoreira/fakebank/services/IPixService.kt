package br.com.lucassalesmoreira.fakebank.services

import br.com.lucassalesmoreira.fakebank.models.dto.PixDTO
import br.com.lucassalesmoreira.fakebank.models.dto.PixOperationResultDTO
import br.com.lucassalesmoreira.fakebank.models.entity.PixEntity
import org.springframework.stereotype.Service

@Service
interface IPixService {
    fun sendPix(pixDTO: PixDTO): PixOperationResultDTO
    fun findById(pixId: String): PixEntity
}