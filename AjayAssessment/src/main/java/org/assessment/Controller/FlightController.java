package org.assessment.Controller;

import org.assessment.Modal.Flight;
import org.assessment.Service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;


@Controller
public class FlightController {

    @Autowired
    private FlightService flightService;



    //for displaying home page
    @RequestMapping(value="/home")
    public ModelAndView displayHomePage(){
        List<Flight>flightList=flightService.findAllFlight();



        ModelAndView modelAndView=new ModelAndView("Home");
        modelAndView.addObject("AllflightList",flightList);

        return modelAndView;
    }


    //for displaying save page
    @RequestMapping("/displaysavepage")
    public ModelAndView displaySavePage(){



        ModelAndView modelAndView=new ModelAndView("SaveFlightDetail");



        return modelAndView;
    }


    //it is called when user click on save flight button
    @RequestMapping(value="/saveFlight",method= RequestMethod.POST)
    public String saveFlightDetails(@Valid @ModelAttribute Flight flight, Errors errors){


        if(errors.hasErrors()){
            return "saveFlightDetail";
        }

        int result= flightService.saveFlightDetails(flight);

        if(result>0){
            return "redirect:home";
        }

        return "SaveFlightDetail";
    }


    //it is called when user want to search flight
    @RequestMapping(value ="/searchFlight",method = RequestMethod.POST)
    public ModelAndView searchFlight(@RequestParam(name="source")String source,@RequestParam(name="destination")String destination){

        List<Flight> flightList=flightService.searchFlight(source,destination);



        ModelAndView modelAndView =new ModelAndView("DisplaySearchedFlight");


        modelAndView.addObject("searchedFlightList",flightList);


        return modelAndView;


    }

    //it is called to display searched result
    @RequestMapping(value="/displaysearchpage")
    public ModelAndView displaySearchPage(){
        ModelAndView modelAndView =new ModelAndView("searchflight");
        return modelAndView;
    }


}
