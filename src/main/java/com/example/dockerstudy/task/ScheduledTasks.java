package com.example.dockerstudy.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

  @Scheduled(fixedRate = 5000) // Execute every 5 seconds
  public void task1() {
    System.out.println("Task 1 executed");
  }

  @Scheduled(cron = "0 0/1 * 1/1 * ?") // Execute every minute
  public void task2() {
    System.out.println("Task 2 executed");
  }
}
