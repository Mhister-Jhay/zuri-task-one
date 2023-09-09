package org.jhay.application.service;

import org.jhay.application.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User getUser(String slack_name, String track);
}
