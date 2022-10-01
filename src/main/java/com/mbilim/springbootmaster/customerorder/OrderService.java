package com.mbilim.springbootmaster.customerorder;

import com.mbilim.springbootmaster.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    Order getOrder(Long id){
        return orderRepository.getOrders().stream()
                .filter(order -> order.getOderId() == id)
                .findFirst()
                .orElseThrow(()->new NotFoundException(
                        "Order  with  id "+id+" not found"
                ));
    }

    List<Order> getOrders(){
        return orderRepository.getOrders();
    }
}
