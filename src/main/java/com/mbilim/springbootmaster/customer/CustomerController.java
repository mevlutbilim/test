package com.mbilim.springbootmaster.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/customer")
@Deprecated
public class CustomerController {


    private final CustomerService customerService;
    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "all")
    List<Customer> getCustomer(){
        return  customerService.getCustomers();
    }

    @PostMapping
    void createCustomer(@RequestBody  Customer customer){

        System.out.println("Post Request");
        System.out.println(customer);
    }
    @PutMapping
    void updateCustomer(@RequestBody  Customer customer){

        System.out.println("Put Request");
        System.out.println(customer);
    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id){
        System.out.println("Delete request for customer: "+id);

    }

}
