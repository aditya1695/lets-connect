package com.letsconnect.social.service;

import com.letsconnect.social.client.UserClient;
import com.letsconnect.social.client.response.UserDetail;
import com.letsconnect.social.mapper.UserMapper;
import com.letsconnect.social.pojo.Address;
import com.letsconnect.social.pojo.Name;
import com.letsconnect.social.pojo.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;


@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    private final LocalDateTime currentTime = LocalDateTime.now();
    @Mock
    private UserClient userClient;
    @Mock
    private UserMapper userMapper;
    @InjectMocks
    private UserService userService;

    @Test
    @DisplayName("Should fetch the detail of all users")
    void shouldGetAllUsersDetail() {
        //given
        var userDetail = getUserDetail();
        var expected = getExpectedUser();

        given(userClient.getUsersDetail()).willReturn(List.of(userDetail));
        given(userMapper.toUserResponse(userDetail)).willReturn(expected);

        //when
        var actual = userService.getAllUsersDetail();

        //then
        assertThat(actual).isEqualTo(List.of(expected));

    }

    @Test
    @DisplayName("should fetch detail of user for given id")
    void shouldFetchUserDetailById() {
        //given
        var userId = "1";
        var userDetail = getUserDetail();
        var expected = getExpectedUser();
        given(userClient.getUserDetailById(userId)).willReturn(userDetail);
        given(userMapper.toUserResponse(userDetail)).willReturn(expected);

        //when
        var actual = userService.getUserDetailById(userId);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    private User getExpectedUser() {
        return User.builder()
                .fullName(Name.builder()
                        .firstName("TEST")
                        .middleName("USER")
                        .lastName("PARAMETER")
                        .build())
                .sex("MALE")
                .age(20)
                .phoneNumber("+91-362148256")
                .address(Address.builder()
                        .city("PATNA")
                        .state("MAHARASHTRA")
                        .zipCode("800020")
                        .country("INDIA")
                        .build())
                .dateOfBirth("12 Sep 2004")
                .build();
    }

    private UserDetail getUserDetail() {
        return UserDetail.builder()
                .id("1")
                .city("Patna")
                .sex("MALE")
                .country("INDIA")
                .createdAt(currentTime)
                .dateOfBirth(currentTime.minusYears(20L))
                .firstName("TEST")
                .middleName("USER")
                .lastName("PARAMETER")
                .phoneNumber("+91-362148256")
                .state("MAHARASHTRA")
                .zipCode("800020")
                .build();
    }
}