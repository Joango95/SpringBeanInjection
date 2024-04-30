package com.joango.bean.control.services.impl

import com.joango.bean.control.services.OutputUserService
import com.joango.bean.control.model.UserEntity
import mu.KotlinLogging

class CloudUserService: OutputUserService {

    private val logger = KotlinLogging.logger {}

    init {
        logger.info { "Using cloud server user service" }
    }

    override fun addUser(user: UserEntity): UserEntity {
        //Add user request to cloud
        return TODO("Provide the return value")
    }

    override fun updateUser(user: UserEntity): UserEntity {
        //Update user request to cloud
        return TODO("Provide the return value")
    }
}