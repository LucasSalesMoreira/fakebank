package br.com.lucassalesmoreira.fakebank.controllers

import br.com.lucassalesmoreira.fakebank.errors.MessageError
import br.com.lucassalesmoreira.fakebank.models.dto.PixDTO
import br.com.lucassalesmoreira.fakebank.services.IPixService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/pix")
class PixController(var iPixService: IPixService) {
    @PostMapping
    fun sendPix(@RequestBody pixDTO: PixDTO): ResponseEntity<Any> {
        return try {
            val result = iPixService.sendPix(pixDTO)
            if (result.operationResult)
                ResponseEntity.ok(iPixService.findById(result.pixId))
            else
                ResponseEntity.badRequest().body(MessageError("Valor do saldo insuficiente!"))

        } catch (error: Exception) {
           ResponseEntity.badRequest().body(MessageError("Falha no envio do pix!"))
        }
    }
}