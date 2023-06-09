package com.starlucks.payment.helper

import com.starlucks.payment.dto.request.PaymentPayRequest
import com.starlucks.payment.infrastructure.repository.PaymentRepository

class TossPaymentHelper(private val paymentRepository: PaymentRepository): PaymentHelper {
    override fun getName(): String {
        return TOSS
    }

    override fun pay(paymentPayRequest: PaymentPayRequest) {
        // paymentRepository.save()
    }

    companion object {
        private const val TOSS = "toss"
    }
}