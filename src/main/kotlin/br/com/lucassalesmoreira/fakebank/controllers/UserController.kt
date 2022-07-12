package br.com.lucassalesmoreira.fakebank.controllers

import br.com.lucassalesmoreira.fakebank.errors.MessageError
import br.com.lucassalesmoreira.fakebank.models.dto.UserDTO
import br.com.lucassalesmoreira.fakebank.models.dto.UserUpdateDTO
import br.com.lucassalesmoreira.fakebank.services.IUserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController(var iUserService: IUserService) {
    @GetMapping
    fun getAll(): ResponseEntity<Any> {
        return try {
            ResponseEntity.ok(iUserService.findAll())
        } catch (error: Exception) {
            ResponseEntity.badRequest().body(MessageError("Problema ao processar a requisição"))
        }
    }

    @PostMapping
    fun add(@RequestBody userDTO: UserDTO): ResponseEntity<Any> {
        return try {
            ResponseEntity.ok(iUserService.create(userDTO))
        } catch (error: Exception) {
            println(error.message)
            ResponseEntity.badRequest().body(MessageError("Problema ao processar a requisição"))
        }
    }

    @PutMapping("/{id}")
    fun update(@RequestBody userUpdateDTO: UserUpdateDTO, @PathVariable id: String): ResponseEntity<Any> {
        return try {
            ResponseEntity.ok(iUserService.update(userUpdateDTO, id))
        } catch (error: Exception) {
            ResponseEntity.badRequest().body(MessageError("Problema ao processar a requisição"))
        }
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: String): ResponseEntity<Any> {
        return try {
            ResponseEntity.ok(iUserService.delete(id))
        } catch (error: Exception) {
            ResponseEntity.badRequest().body(MessageError("Problema ao processar a requisição"))
        }
    }
}