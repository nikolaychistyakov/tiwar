package com.example.tiwar.config.schedule;

import com.example.tiwar.services.user.UserService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleMethods {

    final UserService userService;

    public ScheduleMethods(UserService userService) {
        this.userService = userService;
    }

    @Scheduled(fixedDelay = 100000)
    public void scheduleFixedDelayTask() {
        System.out.println("Add mana and Health");
        userService.plusManaUser();
        userService.plusHealthUser();
    }

}