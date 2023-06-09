package com.starlucks

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StarlucksApplication

fun main(args: Array<String>) {
    runApplication<StarlucksApplication>(*args)
}