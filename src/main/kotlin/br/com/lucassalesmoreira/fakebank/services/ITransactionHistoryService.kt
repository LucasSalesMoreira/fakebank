package br.com.lucassalesmoreira.fakebank.services

import br.com.lucassalesmoreira.fakebank.models.dto.TransactionDTO
import org.springframework.stereotype.Service

@Service
interface ITransactionHistoryService {
    /**
     * Retorna todas as transações entre contas.
     * @return List<TransactionDTO>
     */
    fun getAll(): List<TransactionDTO>

    /**
     * Retorna todas as transações realizadas por um usuário.
     * @param senderId: String
     * @return List<TransactionDTO>
     */
    fun getAllBySenderId(senderId: String): List<TransactionDTO>
}