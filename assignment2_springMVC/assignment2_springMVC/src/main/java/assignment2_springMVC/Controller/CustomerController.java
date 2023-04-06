package assignment2_springMVC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import assignment2_springMVC.Model.Customer;
import assignment2_springMVC.Service.CustomerService;
import java.util.*;



@Controller
public class CustomerController {

	
	@Autowired
    CustomerService customerService;

    @RequestMapping(value={"","/home","/"})
    public String displayHome(){
        //return new ModelAndView("home.html");
        return "home";
    }

    @RequestMapping("/getcustomerdetails")
    public String getCustomerDetails(){
        //ModelAndView modelAndView=new ModelAndView("home.html");

        List<Customer> customerList=customerService.getCustomerDetails();

       for(Customer customer:customerList){
           System.out.println(customer.getName()+" "+customer.getCustomerId()+" "+customer.getLocation());
       }

        return "Home";
    }
}
