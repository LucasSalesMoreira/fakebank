package br.com.lucassalesmoreira.fakebank.repositorys

import br.com.lucassalesmoreira.fakebank.models.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface IUserRepository: JpaRepository<UserEntity, String> {}