package br.com.lucassalesmoreira.fakebank.models.entity

import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name="user")
data class UserEntity (
    @Id
    @Column(name="id")
    var id: String? = UUID.randomUUID().toString(),
    @Column(name="name")
    var name: String,
    @Column(name="email")
    var email: String,
    @Column(name="pass")
    var pass: String,
    @Column(name="money")
    var money: Double? = 0.0,
    @Column(name="active")
    var active: Boolean? = true
)
