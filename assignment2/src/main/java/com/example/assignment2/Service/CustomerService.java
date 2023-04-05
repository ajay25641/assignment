package com.example.assignment2.Service;

import com.example.assignment2.Model.Customer;
import com.example.assignment2.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getCustomerDetails() {
        return customerRepository.getCustomerDetails();
    }
}
