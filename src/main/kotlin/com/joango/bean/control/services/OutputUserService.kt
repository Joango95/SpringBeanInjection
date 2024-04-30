package com.joango.bean.control.services

import com.joango.bean.control.model.UserEntity

interface OutputUserService {
    fun addUser(user: UserEntity): UserEntity
    fun updateUser(user: UserEntity): UserEntity
}