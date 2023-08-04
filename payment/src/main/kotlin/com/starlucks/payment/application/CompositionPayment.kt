package com.starlucks.payment.application

import org.springframework.stereotype.Component

@Component
class CompositionPayment(
    pss: List<PaymentExecutor>
) {
    private val map: MutableMap<String, PaymentExecutor> = HashMap()

    init {
        pss.forEach {
            map[it.getName()] = it
        }
    }

    fun getPaymentImpl(paymentTarget: String): PaymentExecutor {
        return map[paymentTarget] ?: throw RuntimeException()
    }
}