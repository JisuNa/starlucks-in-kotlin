package com.starlucks.payment.helper

import org.springframework.stereotype.Component

@Component
class CompositionPayment(
    pss: List<PaymentHelper>
) {
    private val map: MutableMap<String, PaymentHelper> = HashMap()

    init {
        pss.forEach {
            map[it.getName()] = it
        }
    }

    fun getPaymentImpl(paymentTarget: String): PaymentHelper {
        return map[paymentTarget] ?: throw RuntimeException()
    }
}