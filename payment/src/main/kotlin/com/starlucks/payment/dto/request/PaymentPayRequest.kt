package com.starlucks.payment.dto.request

data class PaymentPayRequest(
    val orderId: Long,
    val amount: Long,
    val paymentTarget: String
)
