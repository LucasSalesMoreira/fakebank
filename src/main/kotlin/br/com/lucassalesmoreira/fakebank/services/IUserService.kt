package br.com.lucassalesmoreira.fakebank.services

import br.com.lucassalesmoreira.fakebank.models.dto.UserDTO
import br.com.lucassalesmoreira.fakebank.models.dto.UserUpdateDTO
import br.com.lucassalesmoreira.fakebank.models.entity.UserEntity
import org.springframework.stereotype.Service

@Service
interface IUserService {
    /**
     * Cria novo usuário.
     * @param userDTO: UserDTO
     * @return List<UserEntity>
     */
    fun create(userDTO: UserDTO): List<UserEntity>

    /**
     * Retorna lista com todos os usuários.
     * @return List<UserEntity>
     */
    fun findAll(): List<UserEntity>

    /**
     * Retorna usuário pelo ID.
     * @param id: String
     * @return UserEntity
     */
    fun findById(id: String): UserEntity

    /**
     * Retorna lista de usuários por IDs informados.
     * @param ids: List<String>
     * @return List<UserEntity>
     */
    fun findAllById(ids: List<String>): List<UserEntity>

    /**
     * Atualiza um usuário.
     * @param id: String
     * @param userDTO: UserUpdateDTO
     * @return Boolean
     */
    fun update(userDTO: UserUpdateDTO, id: String): Boolean

    /**
     * Subtrai valor do saldo do usuário.
     * @param userId: String
     * @param value: Double
     * @return Boolean
     */
    fun subtractMoney(userId: String, value: Double): Boolean

    /**
     * Adiciona valor ao saldo do usuário
     * @param userId: String
     * @param value: Double
     * @return Boolean
     */
    fun addMoney(userId: String, value: Double): Boolean

    /**
     * Remove um usuário.
     * @param id: String
     * @return Boolean
     */
    fun delete(id: String): Boolean
}