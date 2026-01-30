package com.order.management.entity;

import com.order.management.enums.UserType;

public class Customer extends User {
    @Override
    public UserType getType() {
        return UserType.CUSTOMER;
    }
}
