package com.letsconnect.social.mapper;

import com.letsconnect.social.client.response.UserDetail;
import com.letsconnect.social.pojo.Address;
import com.letsconnect.social.pojo.Name;
import com.letsconnect.social.pojo.User;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserMapper {

    public User toUserResponse(UserDetail userDetail) {
        return User.builder()
                .fullName(getFullName(userDetail.firstName(), userDetail.middleName(), userDetail.lastName()))
                .sex(userDetail.sex())
                .age(calculateAge(userDetail.dateOfBirth()))
                .phoneNumber(userDetail.phoneNumber())
                .address(getAddress(userDetail.country(), userDetail.state(), userDetail.city(), userDetail.zipCode()))
                .dateOfBirth(getFormattedDateOfBirth(userDetail.dateOfBirth()))
                .build();
    }

    private Address getAddress(String country, String state, String city, String zipCode) {
        return Address.builder()
                .city(StringUtils.hasLength(city) ? city : "")
                .state(StringUtils.hasLength(state) ? state : "")
                .country(StringUtils.hasLength(country) ? country : "")
                .zipCode(StringUtils.hasLength(zipCode) ? zipCode : "")
                .build();
    }

    private Name getFullName(String firstName, String middleName, String lastName) {
        return Name.builder()
                .firstName(StringUtils.hasLength(firstName) ? firstName : "")
                .middleName(StringUtils.hasLength(middleName) ? middleName : "")
                .lastName(StringUtils.hasLength(lastName) ? lastName : "")
                .build();
    }

    private int calculateAge(LocalDateTime dateOfBirth) {
        var currentDate = LocalDateTime.now();
        return (currentDate.getYear() - dateOfBirth.getYear());
    }

    private String getFormattedDateOfBirth(LocalDateTime dateOfBirth) {
        if (dateOfBirth == null) {
            return "";
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        return dateOfBirth.format(formatter);
    }
}
