package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("")
public class HomeController {


    @RequestMapping(value="/home",method= RequestMethod.GET)

    public String displayHomePage(Model model){
        model.addAttribute("message","from home controller");

        return "hello_world.jsp";
    }
}
