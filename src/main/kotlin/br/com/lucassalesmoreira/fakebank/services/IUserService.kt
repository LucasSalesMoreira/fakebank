package br.com.lucassalesmoreira.fakebank.services

import br.com.lucassalesmoreira.fakebank.models.dto.UserDTO
import br.com.lucassalesmoreira.fakebank.models.entity.UserEntity
import org.springframework.stereotype.Service

@Service
interface IUserService {
    fun create(userDTO: UserDTO): List<UserEntity>

    fun findAll(): List<UserEntity>

    fun update(userDTO: UserDTO, id: String): Boolean

    fun delete(id: String): Boolean
}