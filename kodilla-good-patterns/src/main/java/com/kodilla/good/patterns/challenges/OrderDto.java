package com.kodilla.good.patterns.challenges;

public class OrderDto {

    final User user;
    final boolean isOrder;

    public OrderDto(User user, boolean isOrder) {
        this.user = user;
        this.isOrder = isOrder;
    }

    public User getUser() {
        return user;
    }

    public boolean getIsOrder() {
        return isOrder;
    }

}
