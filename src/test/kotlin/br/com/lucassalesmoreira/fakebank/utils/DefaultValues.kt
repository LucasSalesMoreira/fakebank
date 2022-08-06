package br.com.lucassalesmoreira.fakebank.utils

import br.com.lucassalesmoreira.fakebank.models.dto.PixDTO
import br.com.lucassalesmoreira.fakebank.models.entity.UserEntity

class DefaultValues {
    fun getPixDTO(money: Double) = PixDTO(
        senderId = "String",
        recipientId = "String",
        value = money
    )

    fun getUserEntity(money: Double) = UserEntity(
        id = "String",
        name = "String",
        email = "String",
        pass = "String",
        money = money,
        pixSenders = null,
        pixRecipients = null,
        active = true
    )
}