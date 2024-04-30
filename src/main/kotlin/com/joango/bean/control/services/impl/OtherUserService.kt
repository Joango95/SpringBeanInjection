package com.joango.bean.control.services.impl

import com.joango.bean.control.model.UserEntity
import com.joango.bean.control.services.OutputUserService
import mu.KotlinLogging

class OtherUserService: OutputUserService {

    private val logger = KotlinLogging.logger {}

    init {
        logger.info { "Using other server user service" }
    }

    override fun addUser(user: UserEntity): UserEntity {
        //Add user request to other server
        return TODO("Provide the return value")
    }

    override fun updateUser(user: UserEntity): UserEntity {
        //Update user request to other server
        return TODO("Provide the return value")
    }
}