package br.com.lucassalesmoreira.fakebank.mappers

import br.com.lucassalesmoreira.fakebank.models.dto.UserDTO
import br.com.lucassalesmoreira.fakebank.models.entity.UserEntity

interface IUserMapper {
    fun toEntity(user: UserDTO): UserEntity

    fun toDTO(user: UserEntity): UserDTO
}