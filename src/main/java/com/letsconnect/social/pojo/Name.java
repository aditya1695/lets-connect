package com.letsconnect.social.pojo;

import lombok.Builder;

@Builder
public record Name(
        String firstName,
        String middleName,
        String lastName
) {
}
