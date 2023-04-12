package org.assignment.Modal;

import javax.persistence.*;


@Entity
@Table(name="Hotel")
public class Hotel {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hotelId;

    private String hotelName;
    private String city;

    private String pinCode;

    public Hotel(int hotelId, String hotelName, String city, String pinCode) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.city = city;
        this.pinCode = pinCode;
    }


    public Hotel() {

    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}
