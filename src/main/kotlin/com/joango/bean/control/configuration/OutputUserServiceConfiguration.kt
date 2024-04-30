package com.joango.bean.control.configuration

import com.joango.bean.control.services.OutputUserService
import com.joango.bean.control.services.impl.CloudUserService
import com.joango.bean.control.services.impl.LocalServerUserService
import com.joango.bean.control.services.impl.OtherUserService
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OutputUserServiceConfiguration (
    @Value("\${management.output-user-service:other}")
    private val outputClientServiceToUse: String
) {

    @Bean("OutputUserService")
    fun outputUserService(): OutputUserService =
        when (outputClientServiceToUse) {
            "cloud" -> CloudUserService()
            "local" -> LocalServerUserService()
            else -> OtherUserService()
        }
}