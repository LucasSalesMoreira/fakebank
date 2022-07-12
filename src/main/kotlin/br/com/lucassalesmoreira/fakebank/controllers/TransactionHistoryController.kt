package br.com.lucassalesmoreira.fakebank.controllers

import br.com.lucassalesmoreira.fakebank.errors.MessageError
import br.com.lucassalesmoreira.fakebank.services.ITransactionHistoryService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/transaction")
class TransactionHistoryController(
    val iTransactionHistory: ITransactionHistoryService
) {
    @GetMapping
    fun getAll(): ResponseEntity<Any> {
        return try {
            ResponseEntity.ok(iTransactionHistory.getAll())
        } catch (error: Exception) {
            ResponseEntity.badRequest().body(MessageError("Problema ao processar a requisição"))
        }
    }

    @GetMapping("/{senderId}")
    fun getBySenderId(@PathVariable senderId: String): ResponseEntity<Any> {
        return try {
            ResponseEntity.ok(iTransactionHistory.getBySenderId(senderId))
        } catch (error: Exception) {
            ResponseEntity.badRequest().body(MessageError("Problema ao processar a requisição"))
        }
    }
}