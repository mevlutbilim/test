package com.mbilim.springbootmaster.customer;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository(value = "fake")
public class CustomerFakeRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L,"Mevlut Bilim","password123", "email@email.com"),
                new Customer(2L,"Suad Bilim","1234password", "email@email.com"),
                new Customer(3L,"Umit Bilim","pas34567sword", "email@email.com")

        );
    }
}
