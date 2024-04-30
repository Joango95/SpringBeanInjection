package com.joango.bean.control.persistence

import com.joango.bean.control.model.UserEntity
import mu.KotlinLogging
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.stereotype.Service

@ConditionalOnProperty(
    prefix = "management.persistence",
    name = ["service"],
    havingValue = "mongodb",
    matchIfMissing = false
)
@Service
class MongoDbPersistence: UserPersistence {

    private val logger = KotlinLogging.logger {}

    init {
        logger.info { "Using mongodb repo" }
    }

    override fun add(): UserEntity {
        //Add user on mongodb repo
        return TODO("Provide the return value")
    }

    override fun update(): UserEntity {
        //Update user on mongodb repo
        return TODO("Provide the return value")
    }

    override fun getById(id: String): UserEntity {
        //Get user by id on mongodb repo
        return TODO("Provide the return value")
    }

    override fun delete(id: String) {
        //Delete user by id on mongodb repo
        return TODO("Provide the return value")
    }
}