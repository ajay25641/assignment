package assignment2_springMVC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;

import assignment2_springMVC.Model.Customer;
import assignment2_springMVC.Service.CalculationService;

@Controller
public class Calculation {
	@Autowired
    CalculationService calculationService;

    @RequestMapping("/calculate")
    public void calculate(){
        List<Customer>customerList=calculationService.calculate();

        for(Customer customer:customerList){
            System.out.println("Name : "+customer.getName()+" Id "+customer.getCustomerId()+" location "+customer.getLocation()+" value "+customer.getValue());
        }

    }

}
