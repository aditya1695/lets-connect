package com.letsconnect.social.client.response;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record UserDetail(
        LocalDateTime createdAt,
        String firstName,
        String lastName,
        String middleName,
        String sex,
        String phoneNumber,
        LocalDateTime dateOfBirth,
        String country,
        String state,
        String city,
        String zipCode,
        String id
) {
}