package com.starlucks.payment.helper

import com.starlucks.payment.domain.entity.TossPayment
import com.starlucks.payment.domain.repository.PaymentRepository
import com.starlucks.payment.infrastructure.pay.TossConfirmResponse
import com.starlucks.payment.presentation.request.PaymentPayRequest

class TossPaymentHelper(private val paymentRepository: PaymentRepository): PaymentHelper {
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