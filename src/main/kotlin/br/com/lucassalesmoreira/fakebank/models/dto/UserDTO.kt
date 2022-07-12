package br.com.lucassalesmoreira.fakebank.models.dto

import br.com.lucassalesmoreira.fakebank.models.entity.PixEntity

data class UserDTO (
    var id: String?,
    var name: String,
    var email: String,
    var pass: String,
    var money: Double,
    var pixSenders: List<PixEntity>?,
    var pixRecipients: List<PixEntity>?,
    var active: Boolean = true
)