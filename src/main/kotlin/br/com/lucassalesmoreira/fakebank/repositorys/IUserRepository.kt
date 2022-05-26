package br.com.lucassalesmoreira.fakebank.repositorys

import br.com.lucassalesmoreira.fakebank.models.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
interface IUserRepository: JpaRepository<UserEntity, String> {
    @Transactional
    @Modifying
    @Query("update user set name = :name where id like :id")
    fun updateUserById(name: String, id: String)
}