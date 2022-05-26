package br.com.lucassalesmoreira.fakebank.models.dto

data class UserDTO (
    var email: String,
    var pass: String,
    var money: Double = 100.0,
    var active: Boolean = true
)