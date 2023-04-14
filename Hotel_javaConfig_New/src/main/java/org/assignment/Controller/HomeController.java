package org.assignment.Controller;


import org.assignment.Modal.Hotel;
import org.assignment.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private HotelService hotelService;


    @RequestMapping(value = "/home", method = RequestMethod.GET)

    public ModelAndView displayHomePage() {
        ModelAndView modelAndView = new ModelAndView("home");

        List<Hotel> hotelList = hotelService.loadAllHotel();

        modelAndView.addObject("hotelList", hotelList);

        System.out.println("reached at controller");


        return modelAndView;

    }


    @RequestMapping(value = "/displayHotelSavePage")
    public ModelAndView displayHotelSavePage() {
        ModelAndView modelAndView = new ModelAndView("displayHotelSavePage");

        return modelAndView;

    }


    @RequestMapping(value = "/saveHotel", method = RequestMethod.POST)
    public String saveHotel(@ModelAttribute Hotel hotel) {

        int result = hotelService.saveHotel(hotel);

        if (result > 0) {
            return "redirect:home";
        }

        return "displayHotelSavePage";


    }
}