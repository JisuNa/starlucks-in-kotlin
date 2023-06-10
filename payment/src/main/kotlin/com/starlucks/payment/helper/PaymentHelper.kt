package com.starlucks.payment.helper

import com.starlucks.payment.presentation.request.PaymentPayRequest

interface PaymentHelper {
    fun getName(): String
    fun pay(paymentPayRequest: PaymentPayRequest)
}