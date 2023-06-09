package com.starlucks.payment.service

import com.starlucks.payment.dto.request.PaymentPayRequest
import com.starlucks.payment.helper.CompositionPayment
import org.springframework.stereotype.Service

@Service
class PaymentService(
    private val compositionPayment: CompositionPayment
) {
    fun pay(paymentPayRequest: PaymentPayRequest) {
        compositionPayment.getPaymentImpl(paymentPayRequest.paymentTarget)
            .also { it.pay(paymentPayRequest) }
    }
}
