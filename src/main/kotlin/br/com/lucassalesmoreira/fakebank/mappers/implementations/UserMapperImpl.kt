package br.com.lucassalesmoreira.fakebank.mappers.implementations

import br.com.lucassalesmoreira.fakebank.models.dto.UserDTO
import br.com.lucassalesmoreira.fakebank.models.entity.UserEntity
import br.com.lucassalesmoreira.fakebank.mappers.IUserMapper as IUserMapper1

class UserMapperImpl: IUserMapper1 {
    override fun toEntity(user: UserDTO): UserEntity {
        return UserEntity(
            name = user.name,
            email = user.email,
            pass = user.pass,
            money = user.money,
            active = user.active
        )
    }

    override fun toDTO(user: UserEntity): UserDTO {
        return UserDTO(
            id = user.id,
            name = user.name,
            email = user.email,
            pass = user.pass,
            money = user.money!!,
            active = user.active!!
        )
    }
}