package org.jhay.application.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
public class User {
    private String slack_name;
    private String current_day;
    private LocalDateTime utc_time;
    private String track;
    private String github_file_url;
    private String github_repo_url;
    private int status_code;
}
