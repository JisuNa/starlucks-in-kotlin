package application.fasade

import application.processor.OrderAddProcessor
import org.springframework.stereotype.Service

@Service
class OrderManager(
    private val orderAddProcessor: OrderAddProcessor
) {

    fun addOrder() {
        orderAddProcessor.execute()
    }

    fun getOrders() {

    }

    fun getOrder(orderId: Long) {

    }

    fun cancelOrder() {

    }
}
