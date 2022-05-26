package br.com.lucassalesmoreira.fakebank

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FakebankApplication

fun main(args: Array<String>) {
	runApplication<FakebankApplication>(*args)
}
