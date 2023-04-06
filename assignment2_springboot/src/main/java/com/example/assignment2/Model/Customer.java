package com.example.assignment2.Model;

import lombok.Data;

@Data
public class Customer {
    private String name;
    private int customerId;
    private String location;
    private int value;

    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    public Customer(String name,int customerId,String location) {
        this.customerId = customerId;
        this.location = location;
        this.name = name;
        this.value = 0;
    }
    /*
    public String getName() {
        return this.name;
    }
    public int getCustomerId(){
        return this.customerId;
    }
    public String getLocation(){
        return this.location;
    }*/
}
