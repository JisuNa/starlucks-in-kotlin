package com.starlucks.payment.helper

import com.starlucks.payment.dto.request.PaymentPayRequest

interface PaymentHelper {
    fun getName(): String
    fun pay(paymentPayRequest: PaymentPayRequest)
}