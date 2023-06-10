package com.starlucks.payment.domain.repository

import com.starlucks.payment.domain.entity.Payment

interface PaymentRepository {
    fun save(payment: Payment)
    fun findById(id: Long): Payment?
}