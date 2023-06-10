package com.starlucks.payment.application.processor

import com.starlucks.payment.helper.CompositionPayment
import com.starlucks.payment.presentation.request.PaymentPayRequest

class PaymentProcessor(
    private val compositionPayment: CompositionPayment
) {

    fun execute(paymentPayRequest: PaymentPayRequest) {
        compositionPayment.getPaymentImpl(paymentPayRequest.paymentTarget)
            .also { it.pay(paymentPayRequest) }
    }
}