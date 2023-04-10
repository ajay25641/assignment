package assignment3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import assignment3.Dao.UserDao;
import assignment3.Modal.*;
import assignment3.Service.UserService;



@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(path="/contact")
	public ModelAndView displayContactForm() {
		ModelAndView modelAndView=new ModelAndView("contact");
		return modelAndView;
	}
	
	/*
	@RequestMapping(value="/submitForm",method=RequestMethod.POST)
	public String acceptForm(@RequestParam(name="email") String email,@RequestParam(name="password") String password,@RequestParam(name="userName")String userName,Model model) {
		User user=new User();
		
		user.setEmail(email);
		user.setPassword(password);
		user.setUserName(userName);
		return "success";
	}
	
	*/
	
	@RequestMapping(value="/submitForm",method=RequestMethod.POST)
	public String acceptForm(@ModelAttribute User user,Model model) {
		
		int result=userService.saveUser(user);
		System.out.println("no. of row affected"+result);
		return "success";
	}
	

}
