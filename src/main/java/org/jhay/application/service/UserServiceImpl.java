package org.jhay.application.service;

import org.jhay.application.entity.User;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(String slack_name, String track){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        LocalDateTime utcTime = LocalDateTime.now();
        String formattedUtcTime = utcTime.format(formatter);

        return User.builder()
                .slack_name(slack_name)
                .current_day("Saturday")
                .utc_time(formattedUtcTime)
                .track(track)
                .github_file_url("https://github.com/Mhister-Jhay/zuri-task-one/blob/main/target/HNG-0.0.1-SNAPSHOT.jar")
                .github_repo_url("https://github.com/Mhister-Jhay/zuri-task-one")
                .status_code(200)
                .build();
    }
}
