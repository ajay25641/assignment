package assignment3.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public ModelAndView displayHome() {
		
		ModelAndView modelAndView=new ModelAndView("home");
		
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7);
		
		modelAndView.addObject("name","ajay");
		
		modelAndView.addObject("list",list);
		
		return modelAndView;
	}
	
	

}
