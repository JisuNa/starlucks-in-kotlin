package com.starlucks.payment.presentation

import com.starlucks.payment.service.PaymentService
import com.starlucks.payment.dto.request.PaymentPayRequest
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/payments")
class PaymentController(
    private val paymentService: PaymentService
) {
    @PostMapping
    fun pay(@RequestBody paymentPayRequest: PaymentPayRequest): String {
        paymentService.pay(paymentPayRequest)
        return "a"
    }
}
