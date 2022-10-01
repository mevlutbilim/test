package com.mbilim.springbootmaster.customerorder;

public class Order{
    private final Long oderId;
    private final String orderName;
    private final String email;

    public Order(Long oderId, String orderName, String email) {
        this.oderId = oderId;
        this.orderName = orderName;
        this.email = email;
    }

    public Long getOderId() {
        return oderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oderId=" + oderId +
                ", orderName='" + orderName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
