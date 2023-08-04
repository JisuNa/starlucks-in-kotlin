package presentation

import application.fasade.OrderManager
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/orders")
class OrderController(private val orderManager: OrderManager) {

    @GetMapping(name = "주문 목록 조회")
    fun getOrders() {
        orderManager.getOrders()
    }

    @GetMapping("/{orderId}", name = "주문 조회")
    fun getOrder(@PathVariable orderId: Long) {
        orderManager.getOrder(orderId)
    }

    @PostMapping(name = "주문")
    fun addOrder() {
        orderManager.addOrder()
    }

    // 주문 취소
    @PostMapping("/cancel", name = "주문 취소")
    fun cancelOrder() {
        orderManager.cancelOrder()
    }
}