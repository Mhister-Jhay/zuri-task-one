package org.jhay.application.controller;

import lombok.RequiredArgsConstructor;
import org.jhay.application.entity.User;
import org.jhay.application.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/api")
    public User getUser(@RequestParam("slack_name") String slack_name,
                        @RequestParam("track") String track){
        return userService.getUser(slack_name, track);
    }
}
