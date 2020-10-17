package com.globalline.identitymanager.repository.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class UserConstant {
    public static final String USERS_BY_LOGIN_CACHE = "usersByLogin";

    public static final String USERS_BY_EMAIL_CACHE = "usersByEmail";
}
