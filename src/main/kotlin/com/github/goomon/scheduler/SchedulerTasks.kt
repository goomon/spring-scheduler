package com.github.goomon.scheduler

import java.text.SimpleDateFormat
import java.util.Date
import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class SchedulerTasks {

    private val log = LoggerFactory.getLogger(SchedulerTasks::class.java)
    private val dateFormat = SimpleDateFormat("HH:mm:ss")

    @Scheduled(fixedRate = 5000)
    fun reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(Date()))
    }

    @Scheduled(fixedDelay = 5000)
    fun reportCurrentTimeEveryTenSeconds() {
        log.info("[reportCurrentTimeEveryTenSeconds] The time is now {}", dateFormat.format(Date()))
        Thread.sleep(5000)
    }

    @Scheduled(cron = "0/5 * * * * *")
    fun reportCurrentTimeWithCronExpr() {
        log.info("[reportCurrentTimeWithCronExpr] The time is now {}", dateFormat.format(Date()))
    }
}