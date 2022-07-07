package br.com.lucassalesmoreira.fakebank.repositorys

import br.com.lucassalesmoreira.fakebank.models.entity.UserEntity
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
interface IUserRepository: CrudRepository<UserEntity, String> {
    @Transactional
    @Modifying
    @Query("update user set name = :name where id like :id")
    fun updateUserById(name: String, id: String)

    @Transactional
    @Modifying
    @Query("update user set money = :value where id like :id")
    fun updateMoneyUserById(value: Double, id: String)
}