package br.com.lucassalesmoreira.fakebank.models.entity

import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name="pix")
data class PixEntity (
    @Id
    @Column(name = "id")
    var id: String = UUID.randomUUID().toString(),
    @Column(name = "sender_user_id")
    var senderId: String,
    @Column(name = "recipient_user_id")
    var recipientId: String,
    @Column(name = "value")
    var value: Double = 0.0
)