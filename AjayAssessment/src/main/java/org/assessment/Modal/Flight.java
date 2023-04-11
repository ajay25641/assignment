package org.assessment.Modal;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Size;


@Entity
@Table(name="flight")
public class Flight {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int flightId;


    @NotBlank(message = "name must not be blank")
    @Size(min=3,message="flight name must be atleast 3 character long")
    private String flightName;

    @NotBlank(message = "source must not be blank")
    @Size(min=3,message ="source name must be atleast 3 character long" )
    private String source;

    @Size(min=3,message = "destination name must be 3 character long")
    @NotBlank(message = "destination must not be blank")
    private String destination;

    public Flight() {

    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId=" + flightId +
                ", flightName='" + flightName + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


    public Flight(int flightId, String flightName, String source, String destination) {
        this.flightId = flightId;
        this.flightName = flightName;
        this.source = source;
        this.destination = destination;
    }
}
