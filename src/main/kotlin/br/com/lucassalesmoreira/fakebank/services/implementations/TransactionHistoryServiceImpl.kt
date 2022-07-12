package br.com.lucassalesmoreira.fakebank.services.implementations

import br.com.lucassalesmoreira.fakebank.models.dto.TransactionDTO
import br.com.lucassalesmoreira.fakebank.services.ITransactionHistoryService
import org.springframework.stereotype.Service

@Service
class TransactionHistoryServiceImpl: ITransactionHistoryService {
    override fun getAll(): TransactionDTO {
        TODO("Not yet implemented")
    }

    override fun getBySenderId(senderId: String): TransactionDTO {
        TODO("Not yet implemented")
    }
}