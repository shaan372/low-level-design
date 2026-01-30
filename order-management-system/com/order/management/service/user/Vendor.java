package com.order.management.service.user;

import com.order.management.enums.UserType;

public class Vendor extends User {

    @Override
    public UserType getType() {
        return UserType.VENDOR;
    }
}
