package com.sachet.springregistry

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class SpringRegistryApplication

fun main(args: Array<String>) {
	runApplication<SpringRegistryApplication>(*args)
}
