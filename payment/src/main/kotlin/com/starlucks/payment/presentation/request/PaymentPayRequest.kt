package com.starlucks.payment.presentation.request

data class PaymentPayRequest(
    val orderId: Long,
    val amount: Long,
    val paymentTarget: String
)
