package br.com.lucassalesmoreira.fakebank.models.dto

data class UserDTO (
    var name: String,
    var email: String,
    var pass: String,
    var money: Double,
    var active: Boolean = true
)