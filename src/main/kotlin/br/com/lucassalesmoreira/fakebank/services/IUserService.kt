package br.com.lucassalesmoreira.fakebank.services

import br.com.lucassalesmoreira.fakebank.models.dto.UserDTO
import br.com.lucassalesmoreira.fakebank.models.dto.UserUpdateDTO
import br.com.lucassalesmoreira.fakebank.models.entity.UserEntity
import org.springframework.stereotype.Service

@Service
interface IUserService {
    /**
     * @param userDTO: UserDTO
     * @return List<UserEntity>
     */
    fun create(userDTO: UserDTO): List<UserEntity>

    fun findAll(): List<UserEntity>

    fun findById(id: String): UserEntity

    fun findAllById(ids: List<String>): List<UserEntity>

    fun update(userDTO: UserUpdateDTO, id: String): Boolean

    fun subtractMoney(userId: String, value: Double): Boolean

    fun addMoney(userId: String, value: Double): Boolean

    fun delete(id: String): Boolean
}