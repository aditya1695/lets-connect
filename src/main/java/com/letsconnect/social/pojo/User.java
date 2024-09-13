package com.letsconnect.social.pojo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private Name fullName;
    private String sex;
    private String phoneNumber;
    private Address address;
    private String dateOfBirth;
    private int age;
}
