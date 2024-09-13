package com.letsconnect.social.contoller;

import com.letsconnect.social.pojo.User;
import com.letsconnect.social.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/details/{id}")
    public ResponseEntity<User> getUserDetails(@PathVariable("id") String userId) {
        return ResponseEntity.ok(userService.getUserDetailById(userId));
    }

    @GetMapping("/details")
    public ResponseEntity<List<User>> getUsersDetail() {
        return ResponseEntity.ok(userService.getAllUsersDetail());
    }

}
