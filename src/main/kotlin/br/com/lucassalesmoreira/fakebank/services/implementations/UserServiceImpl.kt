package br.com.lucassalesmoreira.fakebank.services.implementations

import br.com.lucassalesmoreira.fakebank.models.dto.UserDTO
import br.com.lucassalesmoreira.fakebank.models.entity.UserEntity
import br.com.lucassalesmoreira.fakebank.repositorys.IUserRepository
import br.com.lucassalesmoreira.fakebank.services.IUserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(var iUserRepository: IUserRepository): IUserService {
    override fun create(userDTO: UserDTO): List<UserEntity> {
        val userEntity = UserEntity(
            email = userDTO.email,
            pass = userDTO.pass,
            money = userDTO.money,
            active = userDTO.active
        )
        println(userEntity.toString())
        iUserRepository.save(userEntity)
        return iUserRepository.findAll()
    }
}