package com.example.assignment2.Controlller;

import com.example.assignment2.Model.Customer;
import com.example.assignment2.Model.Transaction;
import com.example.assignment2.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping(value={"","/home","/"})
    public String displayHome(){
        //return new ModelAndView("home.html");
        return "home.html";
    }

    @RequestMapping("/getcustomerdetails")
    public ModelAndView getCustomerDetails(){
        ModelAndView modelAndView=new ModelAndView("home.html");

        List<Customer> customerList=customerService.getCustomerDetails();

       for(Customer customer:customerList){
           System.out.println(customer.getName()+" "+customer.getCustomerId()+" "+customer.getLocation());
       }

        return modelAndView;
    }


}
