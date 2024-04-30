package com.joango.bean.control.model

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "user_entity")
data class UserEntity(
    @Id val id: String = "",
    val name: String = "",
    val email: String = "",
    val phoneNumber: Int = 0
)
