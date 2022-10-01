package com.mbilim.springbootmaster.customerorder;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderRepository implements OrderRepo{


    @Override
    public List<Order> getOrders() {
        return List.of(
                new Order(2L,"IPhone 13","email13"),
                new Order(3L,"IPhone 12","email12"),
                new Order(4L,"IPhone 11","email11")


                );
    }
}
