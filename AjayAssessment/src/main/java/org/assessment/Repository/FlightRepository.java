package org.assessment.Repository;

import org.assessment.Modal.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Repository
public class FlightRepository {



    private HibernateTemplate hibernateTemplate;


    //for saving flight detail
    @Transactional
    public int saveFlightDetails(Flight flight){
        int result =(Integer) this.hibernateTemplate.save(flight);
        return result;
    }


    //gettting flight my flightId
    public Flight getFlightDetails(int flightId){
        Flight flight=hibernateTemplate.load(Flight.class,flightId);
        return flight;
    }



    //searching flight by source and destination
    public List<Flight> searchFlight(String source,String destination){

        String query="FROM Flight flight WHERE flight.source=:sourceStation and flight.destination=:destinationStation";
        String paramNames[]={"sourceStation","destinationStation"};
        Object values[]={source,destination};

        List<Flight> flightList= (List<Flight>) this.hibernateTemplate.findByNamedParam(query,paramNames,values);

        return flightList;
    }



    @Autowired
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate=hibernateTemplate;
    }

    //find all flight which is available in database
    public List<Flight> findAllFlight() {
        List<Flight>flightList=hibernateTemplate.loadAll(Flight.class);
        return flightList;
    }
}
