package com.starlucks.payment.application.fasade

import com.starlucks.payment.application.processor.PaymentProcessor
import com.starlucks.payment.presentation.request.PaymentPayRequest
import org.springframework.stereotype.Service

@Service
class PaymentManager(private val paymentProcessor: PaymentProcessor) {

    fun pay(paymentPayRequest: PaymentPayRequest) {
        paymentProcessor.execute(paymentPayRequest)
    }
}