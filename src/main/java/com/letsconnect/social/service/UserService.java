package com.letsconnect.social.service;

import com.letsconnect.social.client.UserClient;
import com.letsconnect.social.mapper.UserMapper;
import com.letsconnect.social.pojo.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
public class UserService {

    private final UserClient userClient;
    private final UserMapper userMapper;

    public List<User> getAllUsersDetail() {
        log.info("Fetching All users detail");
        var usersDetail = userClient.getUsersDetail();
        return usersDetail.stream().map(userMapper::toUserResponse).toList();
    }

    public User getUserDetailById(String userId) {
        log.info("Fetching detail for user id: {}", userId);
        var userDetail = userClient.getUserDetailById(userId);
        return userMapper.toUserResponse(userDetail);
    }
}
