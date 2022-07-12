package br.com.lucassalesmoreira.fakebank.services

import br.com.lucassalesmoreira.fakebank.models.dto.TransactionDTO
import org.springframework.stereotype.Service

@Service
interface ITransactionHistoryService {
    fun getAll(): TransactionDTO
    fun getBySenderId(senderId: String): TransactionDTO
}