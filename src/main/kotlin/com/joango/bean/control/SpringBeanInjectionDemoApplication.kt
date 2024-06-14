package com.joango.bean.control

import com.joango.bean.control.persistence.UserPersistence
import mu.KotlinLogging
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableAutoConfiguration(exclude = [
	DataSourceAutoConfiguration::class,
	DataSourceTransactionManagerAutoConfiguration::class
])
class SpringBeanInjectionDemoApplication (
	val dbPersistence: UserPersistence
) {
	private val logger = KotlinLogging.logger {}

	init {
		logger.info { "App started " }
	}
}

fun main(args: Array<String>) {
	runApplication<SpringBeanInjectionDemoApplication>(*args)
}
