package assignment2_springMVC.Model;

import org.springframework.stereotype.Component;

@Component
public class Transaction {

	int customerId;
    int value;

    public Transaction(int customerId,int value){
        this.customerId=customerId;
        this.value=value;
    }
    
    public int getCustomerId() {
    	return this.customerId;
    }
    public int getValue() {
    	return this.value;
    }
    public void setValue(int value) {
    	this.value=value;
    }
    public void setCustomerId(int customerId) {
    	this.customerId=customerId;
    }
}
