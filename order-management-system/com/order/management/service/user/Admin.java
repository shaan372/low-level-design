package com.order.management.service.user;

import com.order.management.enums.UserType;

public class Admin extends User{

    @Override
    public UserType getType() {
        return UserType.ADMIN;
    }
}
