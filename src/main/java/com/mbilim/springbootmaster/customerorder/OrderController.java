package com.mbilim.springbootmaster.customerorder;

import com.mbilim.springbootmaster.exception.ApiRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
   List<Order> getOrders(){
        return orderService.getOrders();
   }

   @GetMapping(value = "{orderId}/exception")
    Order getOrderException(@PathVariable("orderId") Long id){
        throw   new ApiRequestException(
                "ApiRequestException for order"+id
        );
   }

    @GetMapping(value = "{orderId}")
    Order getOrder(@PathVariable("orderId") Long id){
        return  orderService.getOrder(id);
    }
}
