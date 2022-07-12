package br.com.lucassalesmoreira.fakebank.services.implementations

import br.com.lucassalesmoreira.fakebank.mappers.IUserMapper
import br.com.lucassalesmoreira.fakebank.models.dto.UserDTO
import br.com.lucassalesmoreira.fakebank.models.dto.UserUpdateDTO
import br.com.lucassalesmoreira.fakebank.models.entity.UserEntity
import br.com.lucassalesmoreira.fakebank.repositorys.IUserRepository
import br.com.lucassalesmoreira.fakebank.services.IUserService
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class UserServiceImpl(val iUserRepository: IUserRepository, val iUserMapper: IUserMapper): IUserService {
    override fun create(userDTO: UserDTO): List<UserEntity> {
        val userEntity = iUserMapper.toEntity(userDTO)
        userEntity.id = UUID.randomUUID().toString()
        println(userEntity.toString())
        iUserRepository.save(userEntity)
        return iUserRepository.findAll().toList()
    }

    override fun findAll(): List<UserEntity> {
        return iUserRepository.findAll().toList()
    }

    override fun findAllById(ids: List<String>): List<UserEntity> {
        return iUserRepository.findAllById(ids).toList()
    }

    override fun findById(id: String): UserEntity {
        return iUserRepository.findAllById(listOf(id)).first()
    }

    override fun update(userDTO: UserUpdateDTO, id: String): Boolean {
        return try {
            iUserRepository.updateUserById(userDTO.name, id)
            true
        } catch (error: Exception) {
            println(error.message)
            false
        }
    }

    override fun delete(id: String): Boolean {
        return try {
            iUserRepository.deleteAllById(listOf(id))
            return true
        } catch (error: Exception) {
            println(error.message)
            false
        }
    }

    override fun subtractMoney(userId: String, value: Double): Boolean {
        return try {
            val user = findAllById(listOf(userId)).first()
            user.money = user.money!! - value
            iUserRepository.updateMoneyUserById(user.money!!, user.id!!)
            true
        } catch (error: Exception) {
            false
        }
    }

    override fun addMoney(userId: String, value: Double): Boolean {
        return try {
            val user = findAllById(listOf(userId)).first()
            user.money = user.money!! + value
            iUserRepository.updateMoneyUserById(user.money!!, user.id!!)
            true
        } catch (error: Exception) {
            false
        }
    }
}