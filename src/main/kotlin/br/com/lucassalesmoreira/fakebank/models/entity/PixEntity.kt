package br.com.lucassalesmoreira.fakebank.models.entity

import java.util.UUID
import javax.persistence.*

@Entity(name="pix")
data class PixEntity (
    @Id
    @Column(name = "id")
    var id: String = UUID.randomUUID().toString(),

    @ManyToOne
    @JoinColumn(name = "sender_user_id")
    var sender: UserEntity,

    @ManyToOne
    @JoinColumn(name = "recipient_user_id")
    var recipient: UserEntity,

    @Column(name = "value")
    var value: Double = 0.0
)