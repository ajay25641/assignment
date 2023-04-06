package assignment2_springMVC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;



import assignment2_springMVC.Model.Transaction;
import assignment2_springMVC.Service.TransactionService;

public class TransactionController {

	 @Autowired
	    TransactionService transactionService;

	    @RequestMapping("/gettransactiondetails")
	    public void getTransactionDetails(){
	        List<Transaction>transactionList=transactionService.getTransactionDetails();
	        ModelAndView modelAndView=new ModelAndView("home.html");
	        modelAndView.addObject("transactonList",transactionList);

	        for(Transaction transaction:transactionList){
	            System.out.println(transaction.getCustomerId()+" "+transaction.getValue());
	        }
	        //return modelAndView;
	    }


	    @RequestMapping(value="/addtransaction",method = RequestMethod.POST)
	    public void addTransaction(Transaction transaction){
	         transactionService.addTransaction(transaction);
	    }
}
