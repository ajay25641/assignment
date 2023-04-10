package demoAssignment.Controller;

import demoAssignment.Modal.User;
import demoAssignment.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping("/home")
    public ModelAndView displayHome(){

        ModelAndView modelAndView=new ModelAndView("home");

        List<User> userList=userService.getUser();

        modelAndView.addObject("userList",userList);
        return modelAndView;

    }



}
