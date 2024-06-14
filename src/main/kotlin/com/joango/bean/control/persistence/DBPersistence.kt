package com.joango.bean.control.persistence

import com.joango.bean.control.model.UserEntity
import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.stereotype.Service
import kotlin.collections.List

@ConditionalOnProperty(
    prefix = "management.persistence",
    name = ["service"],
    havingValue = "postgres"
)
@Service
class DBPersistence: UserPersistence {

    private val logger = KotlinLogging.logger {}
    @Autowired
    private lateinit var userRepository: UserRepository

    init {
        logger.info { "Using postgresDB repo" }
    }

    override fun add(): UserEntity {
        TODO("Not yet implemented")
    }

    override fun update(): UserEntity {
        TODO("Not yet implemented")
    }

    override fun getById(id: String): UserEntity {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<UserEntity> {
        return userRepository.findAll().toList()
    }

    override fun delete(id: String) {
        TODO("Not yet implemented")
    }
}