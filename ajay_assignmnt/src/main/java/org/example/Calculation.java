package org.example;


import java.util.ArrayList;
import java.util.HashMap;

public class Calculation {

    //method for calculating our result
    static void calculate(ArrayList<Customer> customers, ArrayList<Transaction>transactions){

        //we use hashmap for mapping customerId with customer object
        HashMap<Integer,Customer>hm=new HashMap<>();

        for(Customer customer:customers){
            hm.putIfAbsent(customer.customerId,customer);
        }

        for(Transaction transaction:transactions){
            int id=transaction.customerId;
            int value=transaction.value;

            hm.get(id).value+=value;

        }



    }
}
