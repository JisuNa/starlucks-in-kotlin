package com.starlucks.payment.domain.entity

import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity
import jakarta.persistence.PrimaryKeyJoinColumn

@Entity
@PrimaryKeyJoinColumn(name = "id")
@DiscriminatorValue("toss")
class TossPayment(
    override var orderId: Long,
    override var amount: Long,
    var tossId: String
) : Payment(orderId, amount)