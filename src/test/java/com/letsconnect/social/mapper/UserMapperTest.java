package com.letsconnect.social.mapper;

import com.letsconnect.social.client.response.UserDetail;
import com.letsconnect.social.pojo.Address;
import com.letsconnect.social.pojo.Name;
import com.letsconnect.social.pojo.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class UserMapperTest {

    @Spy
    private UserMapper userMapper;

    public static final LocalDateTime CURRENT_TIME = LocalDateTime.now();
    private static final UserDetail USER_DETAIL = UserDetail.builder()
            .id("1")
            .city("PATNA")
            .sex("MALE")
            .country("INDIA")
            .createdAt(CURRENT_TIME)
            .dateOfBirth(CURRENT_TIME.minusYears(20L))
            .firstName("TEST")
            .middleName("USER")
            .lastName("PARAMETER")
            .phoneNumber("+91-362148256")
            .state("MAHARASHTRA")
            .zipCode("800020")
            .build();



    @Test
    @DisplayName("should map users detail to users for given user")
    void shouldMapUsersDetailToUser() {
        //given
        var mappedUSer = getMappedUser();
        //when
        var actual = userMapper.toUserResponse(USER_DETAIL);
        //then
        assertThat(actual).isEqualTo(mappedUSer);
    }

    private User getMappedUser() {
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
                .dateOfBirth("12 Sept 2004")
                .build();
    }

}