package br.com.lucassalesmoreira.fakebank.repositorys

import br.com.lucassalesmoreira.fakebank.models.entity.PixEntity
import org.springframework.data.repository.CrudRepository

interface IPixRepository: CrudRepository<PixEntity, String> {}