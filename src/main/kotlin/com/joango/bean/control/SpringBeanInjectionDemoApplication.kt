package com.joango.bean.control

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.PropertySource

@PropertySource("classpath:application.yml")
@SpringBootApplication
class SpringBeanInjectionDemoApplication

fun main(args: Array<String>) {
	runApplication<SpringBeanInjectionDemoApplication>(*args)
}
