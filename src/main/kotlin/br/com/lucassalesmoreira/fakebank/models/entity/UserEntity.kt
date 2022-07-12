package br.com.lucassalesmoreira.fakebank.models.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity(name="user")
data class UserEntity (
    @Id
    @Column(name="id")
    var id: String?,
    @Column(name="name")
    var name: String,
    @Column(name="email")
    var email: String,
    @Column(name="pass")
    var pass: String,
    @Column(name="money")
    var money: Double? = 0.0,

    @OneToMany(mappedBy = "sender")
    var pixSenders: List<PixEntity>?,

    @OneToMany(mappedBy = "recipient")
    var pixRecipients: List<PixEntity>?,

    @Column(name="active")
    var active: Boolean? = true
)
