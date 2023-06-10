package com.starlucks.payment.infrastructure.persistence

import com.starlucks.payment.domain.entity.Payment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

interface JpaPaymentRepository: JpaRepository<Payment, Long>