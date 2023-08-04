package com.starlucks.payment.infrastructure.pay

import com.starlucks.payment.domain.entity.TossPayment
import com.starlucks.payment.domain.repository.PaymentRepository
import com.starlucks.payment.application.PaymentExecutor
import com.starlucks.payment.presentation.request.PaymentPayRequest

class TossPaymentExecutor(private val paymentRepository: PaymentRepository): PaymentExecutor {
    override fun getName(): String {
        return TOSS
    }

    override fun pay(paymentPayRequest: PaymentPayRequest) {

        // fake
        val confirmResponse = TossConfirmResponse()

        paymentRepository.save(
            TossPayment(
                orderId = paymentPayRequest.orderId,
                amount = paymentPayRequest.amount,
                tossId = confirmResponse.tossId
            )
        )
    }

    companion object {
        private const val TOSS = "toss"
    }
}