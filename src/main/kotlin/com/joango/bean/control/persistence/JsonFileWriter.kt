package com.joango.bean.control.persistence

import com.joango.bean.control.model.UserEntity
import mu.KotlinLogging
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.stereotype.Service

@ConditionalOnProperty(
    prefix = "management.persistence",
    name = ["service"],
    havingValue = "json"
)
@Service
class JsonFileWriter: UserPersistence {

    private val logger = KotlinLogging.logger {}

    init {
        logger.info { "Using json files repo" }
    }

    override fun add(): UserEntity {
        //Add user on json file
        return TODO("Provide the return value")
    }

    override fun update(): UserEntity {
        //Update user on json file
        return TODO("Provide the return value")
    }

    override fun getById(id: String): UserEntity {
        //Get user by id on json file
        return TODO("Provide the return value")
    }

    override fun getAll(): List<UserEntity> {
        TODO("Not yet implemented")
    }

    override fun delete(id: String) {
        //Delete user by id on json file"
        return TODO("Provide the return value")
    }
}