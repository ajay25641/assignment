package assignment2_springMVC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

import assignment2_springMVC.Model.Customer;
import assignment2_springMVC.Repository.CustomerRepository;


@Component
public class CustomerService {

	@Autowired
    CustomerRepository customerRepository;

    public List<Customer> getCustomerDetails() {
        return customerRepository.getCustomerDetails();
    }
}
