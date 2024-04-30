package com.joango.bean.control.configuration

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource


@Configuration
@ConditionalOnProperty(
    prefix = "management.persistence",
    name = ["service"],
    havingValue = "postgres",
    matchIfMissing = false
)
class DBConfiguration {

    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    fun getDataSource(): DataSource {
        val dataSourceBuilder = DataSourceBuilder.create()
        dataSourceBuilder.username("SA")
        dataSourceBuilder.password("")
        return dataSourceBuilder.build()
    }
}