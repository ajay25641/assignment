package org.assessment.Service;


import org.assessment.Modal.Flight;
import org.assessment.Repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public int saveFlightDetails(Flight flight){

       return flightRepository.saveFlightDetails(flight);

    }

    public List<Flight> searchFlight(String source, String destination){
        return flightRepository.searchFlight(source,destination);
    }


    public List<Flight> findAllFlight() {
        return flightRepository.findAllFlight();
    }
}
