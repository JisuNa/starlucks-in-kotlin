package com.starlucks.payment.application.processor

import com.starlucks.payment.application.CompositionPayment
import com.starlucks.payment.presentation.request.PaymentPayRequest
import org.springframework.transaction.annotation.Transactional

@Transactional
class PaymentProcessor(
    private val compositionPayment: CompositionPayment
) {

    fun execute(paymentPayRequest: PaymentPayRequest) {
        compositionPayment.getPaymentImpl(paymentPayRequest.paymentTarget)
            .also { it.pay(paymentPayRequest) }
    }
}
