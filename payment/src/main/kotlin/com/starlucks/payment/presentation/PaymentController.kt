package com.starlucks.payment.presentation

import com.starlucks.payment.presentation.request.PaymentPayRequest
import com.starlucks.payment.application.fasade.PaymentManager
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/payments")
class PaymentController(
    private val paymentManager: PaymentManager
) {
    @PostMapping
    fun pay(@RequestBody paymentPayRequest: PaymentPayRequest): String {
        paymentManager.pay(paymentPayRequest)
        return "a"
    }
}
