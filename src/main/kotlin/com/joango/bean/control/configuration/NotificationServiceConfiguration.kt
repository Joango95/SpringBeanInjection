package com.joango.bean.control.configuration

import com.joango.bean.control.services.NotificationService
import com.joango.bean.control.services.impl.SmsService
import com.joango.bean.control.services.impl.EmailService
import com.joango.bean.control.services.impl.WhatsappService
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class NotificationServiceConfiguration (
    @Value("\${management.notification-service:other}")
    private val notificationServiceToUse: String
) {

    @Bean
    fun getNotificationService(): NotificationService =
        when (notificationServiceToUse) {
            "sms" -> SmsService()
            "email" -> EmailService()
            else -> WhatsappService()
        }
}