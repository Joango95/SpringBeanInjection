package com.joango.bean.control.services

import com.joango.bean.control.model.UserEntity

interface NotificationService {
    fun sendSingleNotification(user: UserEntity)
    fun sendBatchNotifications(userList: List<UserEntity>)
}