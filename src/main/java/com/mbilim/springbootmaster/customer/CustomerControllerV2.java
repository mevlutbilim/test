package com.mbilim.springbootmaster.customer;

import com.mbilim.springbootmaster.exception.ApiRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RequestMapping(value = "api/v2/customers")
@RestController
public class CustomerControllerV2 {


    private final CustomerService customerService;
    @Autowired
    public CustomerControllerV2(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping()
    List<Customer> getCustomers(){

        return  customerService.getCustomers();
    }

    @GetMapping(path = "{customerId}")
    Customer getCustomer(@PathVariable("customerId") Long id) {

        return customerService.getCustomer(id);
    }

    @GetMapping(path = "{customerId}/exception")
    Customer getCustomerException(@PathVariable("customerId") Long id) {

        throw new ApiRequestException(
                "ApiRequestException for "+ id
        );
    }

    @PostMapping
    void createCustomer(@Valid @RequestBody  Customer customer){

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
