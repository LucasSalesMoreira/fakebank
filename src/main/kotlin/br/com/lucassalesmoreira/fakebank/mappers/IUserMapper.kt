package br.com.lucassalesmoreira.fakebank.mappers

import br.com.lucassalesmoreira.fakebank.models.dto.UserDTO
import br.com.lucassalesmoreira.fakebank.models.entity.UserEntity
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings

@Mapper
interface IUserMapper {
    @Mappings(
        Mapping(target = "pixSenders", ignore = true),
        Mapping(target = "pixRecipients", ignore = true)
    )
    fun toEntity(user: UserDTO): UserEntity

    fun toDTO(user: UserEntity): UserDTO
}