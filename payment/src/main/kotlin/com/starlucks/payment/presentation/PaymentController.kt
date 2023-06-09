package com.starlucks.payment.presentation

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/payments")
class PaymentController {
    @GetMapping
    fun getPayments(): String {
        return "a"
    }
}