package com.example.assignment2.Service;

import com.example.assignment2.Model.Customer;
import com.example.assignment2.Model.Transaction;
import com.example.assignment2.Repository.CustomerRepository;
import com.example.assignment2.Repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class CalculationService {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    TransactionRepository transactionRepository;

    public List<Customer> calculate(){
        List<Customer>customerList=customerRepository.getCustomerDetails();
        List<Transaction>transactionList=transactionRepository.getTransactionDetails();


        HashMap<Integer,Customer>hm=new HashMap<>();
        for(Customer customer:customerList){
            hm.putIfAbsent(customer.getCustomerId(),customer);

        }

        for(Transaction transaction:transactionList){
            if(hm.containsKey(transaction.getCustomerId())){
                Customer customer=hm.get(transaction.getCustomerId());
                customer.setValue(customer.getValue()+transaction.getValue());

            }
        }
        return customerList;
    }
}
