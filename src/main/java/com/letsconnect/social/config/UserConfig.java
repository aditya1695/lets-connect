package com.letsconnect.social.config;

import com.letsconnect.social.client.UserClient;
import com.letsconnect.social.mapper.UserMapper;
import com.letsconnect.social.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public UserService userService(UserClient userClient) {
        return new UserService(userClient, new UserMapper());
    }
}
