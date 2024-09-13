package com.letsconnect.social.client;

import com.letsconnect.social.client.response.UserDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "available-users", url = "${mock.url}")
public interface UserClient {

    @GetMapping("/details")
    List<UserDetail> getUsersDetail();

    @GetMapping("/details/{id}")
    UserDetail getUserDetailById(@PathVariable("id") String id);

}
