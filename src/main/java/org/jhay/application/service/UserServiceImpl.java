package org.jhay.application.service;

import org.jhay.application.entity.User;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(String slack_name, String track){
        return User.builder()
                .slack_name(slack_name)
                .current_day("Saturday")
                .utc_time(LocalDateTime.now())
                .track(track)
                .github_file_url("")
                .github_repo_url("https://github.com/Mhister-Jhay/zuri-task-one")
                .status_code(200)
                .build();
    }
}
