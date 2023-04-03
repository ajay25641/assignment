package org.example;

public class Customer {
    String name;
    int customerId;
    String location;
    int value;

    public Customer(String name,int customerId,String location){
        this.customerId=customerId;
        this.location=location;
        this.name=name;
        this.value=0;
    }
}
