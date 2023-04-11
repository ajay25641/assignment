package Controller;

import Modal.Hotel;
import Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class HotelController {


    @Autowired
    private HotelService hotelService;

    @RequestMapping(value="/saveHotel",method= RequestMethod.POST)
    public String saveHotel(@ModelAttribute Hotel hotel){


        hotelService.saveHotel(hotel);

    return "home";
    }


    @RequestMapping(value="/searchHotel",method = RequestMethod.POST)
    public ModelAndView searchHotel(@RequestParam(name="city")String city, @RequestParam(name="pincode") String pinCode){

        List<Hotel> hotelList=hotelService.searchHotel(city,pinCode);

        ModelAndView modelAndView=new ModelAndView("result");

        modelAndView.addObject("searchedHotelList",hotelList);

        return  modelAndView;

    }


}
