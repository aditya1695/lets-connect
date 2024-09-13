package com.letsconnect.social.pojo;

import lombok.Builder;

@Builder
public record Address(
        String country,
        String state,
        String city,
        String zipCode
) {
}
