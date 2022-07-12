package br.com.lucassalesmoreira.fakebank.models.dto

data class TransactionDTO (
    var senderUserId: String,
    var recipientId: String,
    var value: Double
)