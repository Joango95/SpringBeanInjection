package com.joango.bean.control.persistence

import com.joango.bean.control.model.UserEntity

interface UserPersistence {
    fun add(): UserEntity
    fun update(): UserEntity
    fun getById(id: String): UserEntity
    fun getAll(): List<UserEntity>
    fun delete(id: String)
}