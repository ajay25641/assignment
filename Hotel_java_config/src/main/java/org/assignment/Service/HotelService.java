package org.assignment.Service;


import org.assignment.Modal.Hotel;
import org.assignment.Repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;
    public int saveHotel(Hotel hotel) {
        return hotelRepository.saveHotel(hotel);

    }

    public List<Hotel> loadAllHotel() {

        return hotelRepository.loadAllHotel();

    }
}
