package demoAssignment.Controller;


import demoAssignment.Modal.User;
import demoAssignment.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ContactController {

    @Autowired
    private UserService userService;

    @RequestMapping(path="/contact")
    public ModelAndView displayContactForm() {
        ModelAndView modelAndView=new ModelAndView("contact");
        return modelAndView;
    }

    @RequestMapping(value="/submitForm",method= RequestMethod.POST)
    public String acceptForm(@ModelAttribute User user) {
        userService.saveUser(user);
        return "redirect:home";
    }


    @RequestMapping(value="/showDeletePage")
   public ModelAndView displayDeletePage(){
        ModelAndView modelAndView=new ModelAndView("showDeletePage");
        return modelAndView;
   }

   @RequestMapping(value="/deleteUser")
   public String deleteUser(@RequestParam(name="employeeId") int id){


        userService.deleteUser(id);
        return "redirect:home";
   }



}
