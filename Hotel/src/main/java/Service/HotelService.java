package Service;

import Modal.Hotel;
import Repository.HotelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HotelService {

    @Autowired

    private HotelDao hotelDao;

    public void saveHotel(Hotel hotel) {

        hotelDao.saveHotel(hotel);

    }

    public List<Hotel> searchHotel(String city, String pinCode) {


        List<Hotel>hotelList=hotelDao.searchHotel(city,pinCode);
        return  hotelList;


    }
}
