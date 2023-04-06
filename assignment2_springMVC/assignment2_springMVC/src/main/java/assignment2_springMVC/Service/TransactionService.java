package assignment2_springMVC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;



import assignment2_springMVC.Model.Transaction;
import assignment2_springMVC.Repository.TransactionRepository;


@Component
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
