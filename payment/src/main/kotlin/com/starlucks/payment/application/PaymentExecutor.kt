package com.starlucks.payment.application

import com.starlucks.payment.presentation.request.PaymentPayRequest

interface PaymentExecutor {
    fun getName(): String
    fun pay(paymentPayRequest: PaymentPayRequest)
}