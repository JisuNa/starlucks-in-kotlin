package com.starlucks.payment.infrastructure.persistence

import com.starlucks.payment.domain.entity.Payment
import com.starlucks.payment.domain.repository.PaymentRepository
import kotlin.jvm.optionals.getOrElse

class PaymentRepositoryAdapter(
    private val jpaPaymentRepository: JpaPaymentRepository
): PaymentRepository {
    override fun save(payment: Payment) {
        jpaPaymentRepository.save(payment)
    }

    override fun findById(id: Long): Payment? {
        return jpaPaymentRepository.findById(id).getOrElse { throw RuntimeException() }
    }
}