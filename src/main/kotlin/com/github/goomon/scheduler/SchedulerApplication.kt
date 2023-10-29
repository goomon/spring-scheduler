package com.github.goomon.scheduler

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class SchedulerApplication

fun main(args: Array<String>) {
	runApplication<SchedulerApplication>(*args)
}
