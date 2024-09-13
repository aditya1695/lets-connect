package com.letsconnect.social.contoller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/friends")
public class FriendsController {
    @GetMapping("/name")
    @Operation(description = "GET API")
    public String sayMyName() {
        return "Aditya";
    }
}
