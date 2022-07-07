package br.com.lucassalesmoreira.fakebank.models.dto

data class PixDTO (
    var senderId: String,
    var recipientId: String,
    var value: Double = 0.0
)