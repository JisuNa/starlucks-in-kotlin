package com.starlucks.payment.infrastructure.config

import com.starlucks.payment.application.processor.PaymentProcessor
import com.starlucks.payment.helper.CompositionPayment
import com.starlucks.payment.helper.TossPaymentHelper
import com.starlucks.payment.domain.repository.PaymentRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class PaymentConfig {
    @Bean
    fun paymentProcessor(compositionPayment: CompositionPayment): PaymentProcessor {
        return PaymentProcessor(compositionPayment)
    }

    @Bean
    fun tossPaymentHelper(paymentRepository: PaymentRepository) = TossPaymentHelper(paymentRepository)
}
