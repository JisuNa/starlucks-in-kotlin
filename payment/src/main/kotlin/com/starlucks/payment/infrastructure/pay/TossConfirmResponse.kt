package com.starlucks.payment.infrastructure.pay

data class TossConfirmResponse(
    val tossId: String = "tosspayments",
    val version: String = "2022-11-16",
    val lastTransactionKey: String = "B7103F204998813B889C77C043D09502",
    val paymentKey: String = "5zJ4xY7m0kODnyRpQWGrN2xqGlNvLrKwv1M9ENjbeoPaZdL6",
    val orderId: String = "a4CWyWY5m89PNh7xJwhk1",
    val orderName: String = "토스 티셔츠 외 2건",
    val currency: String = "KRW",
    val method: String = "카드",
    val status: String = "DONE",
    val requestedAt: String = "2021-01-01T10:01:30+09:00",
    val approvedAt: String = "2021-01-01T10:05:40+09:00",
    val discount: String? = null,
    val cancels: String? = null,
    val secret: String? = null,
    val type: String = "NORMAL",
    val easyPay: String? = null,
    val country: String = "KR",
    val failure: String? = null,
    val totalAmount: Long = 15000L,
    val balanceAmount: Long = 15000L,
    val suppliedAmount: Long = 13636L,
    val vat: Long = 1364L,
    val taxFreeAmount: Long = 0L,
    val taxExemptionAmoun: Long = 0L
)
