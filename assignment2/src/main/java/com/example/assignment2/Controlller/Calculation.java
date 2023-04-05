package com.example.assignment2.Controlller;

import com.example.assignment2.Model.Customer;
import com.example.assignment2.Model.Transaction;
import com.example.assignment2.Service.CalculationService;
import com.example.assignment2.Service.CustomerService;
import com.example.assignment2.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Calculation {

    @Autowired
    CalculationService calculationService;

    @RequestMapping("/calculate")
    public void calculate(){
        List<Customer>customerList=calculationService.calculate();

        for(Customer customer:customerList){
            System.out.println("Name : "+customer.getName()+" Id "+customer.getCustomerId()+" location "+customer.getLocation()+" value "+customer.getValue());
        }

    }
}
