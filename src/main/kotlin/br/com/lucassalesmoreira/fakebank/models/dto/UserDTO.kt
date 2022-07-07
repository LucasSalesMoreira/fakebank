package br.com.lucassalesmoreira.fakebank.models.dto

data class UserDTO (
    var id: String?,
    var name: String,
    var email: String,
    var pass: String,
    var money: Double,
    var active: Boolean = true
)