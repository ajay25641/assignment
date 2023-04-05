package com.example.assignment2.Model;


import lombok.Data;

@Data
public class Transaction {
    int customerId;
    int value;

    public Transaction(int customerId,int value){
        this.customerId=customerId;
        this.value=value;
    }
}
