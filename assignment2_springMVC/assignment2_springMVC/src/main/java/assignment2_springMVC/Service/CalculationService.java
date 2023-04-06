package assignment2_springMVC.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import assignment2_springMVC.Model.Customer;
import assignment2_springMVC.Model.Transaction;
import assignment2_springMVC.Repository.CustomerRepository;
import assignment2_springMVC.Repository.TransactionRepository;


@Component
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
