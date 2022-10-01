package com.mbilim.springbootmaster;

import com.mbilim.springbootmaster.customer.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootMasterApplication {

	public static void main(String[] args) {SpringApplication.run(SpringBootMasterApplication.class, args);

	}

}
