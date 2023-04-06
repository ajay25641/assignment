package assignment2_springMVC.Model;

import org.springframework.stereotype.Component;

@Component
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
    
   

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	public String getLocation() {
		return this.location;
	}
	public int getCustomerId() {
		return this.customerId;
	}
	public int getValue() {
		return this.value;
	}
	
	
	public void setName(String name) {
		this.name=name;
	}
	public void setCustomerId(int customerId) {
		this.customerId=customerId;
	}
	public void setValue(int value) {
		this.value=value;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	
}
