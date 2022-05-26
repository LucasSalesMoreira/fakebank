package br.com.lucassalesmoreira.fakebank.controllers

import br.com.lucassalesmoreira.fakebank.errors.MessageError
import br.com.lucassalesmoreira.fakebank.models.dto.UserDTO
import br.com.lucassalesmoreira.fakebank.services.IUserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController(var iUserService: IUserService) {
    @PostMapping("/add")
    fun add(@RequestBody userDTO: UserDTO): ResponseEntity<Any> {
        return try {
            ResponseEntity.ok(iUserService.create(userDTO))
        } catch (error: Exception) {
            println(error.message)
            ResponseEntity.badRequest().body(MessageError("Problema ao processar a requisição"))
        }
    }
}