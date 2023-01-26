package com.example.log4j

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import java.util.*


@SpringBootApplication
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}

@RestController()
@RequestMapping("/api/logs/consume")
class StockResource() {

    @RequestMapping(consumes = [MediaType.TEXT_PLAIN_VALUE], method = [RequestMethod.POST])
    fun handleRequest(@RequestBody str: String) {
        println(str)
    }
}
