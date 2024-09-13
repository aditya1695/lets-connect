package com.letsconnect.social;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@OpenAPIDefinition
@EnableFeignClients
public class LetsConnectApplication {

    public static void main(String[] args) {
        SpringApplication.run(LetsConnectApplication.class, args);
    }

}
