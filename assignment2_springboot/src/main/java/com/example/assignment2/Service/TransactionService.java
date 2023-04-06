package com.example.assignment2.Service;

import com.example.assignment2.Model.Transaction;
import com.example.assignment2.Repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {


    @Autowired
    TransactionRepository transactionRepository;

    public List<Transaction> getTransactionDetails() {
        return transactionRepository.getTransactionDetails();

    }

    public void addTransaction(Transaction transaction) {
        transactionRepository.addTransaction(transaction);
    }
}
