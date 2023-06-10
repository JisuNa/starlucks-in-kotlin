package com.starlucks.payment.infrastructure.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EnableJpaRepositories(basePackages = ["com.starlucks.payment.infrastructure.persistence"])
class PaymentJpaConfig {
}