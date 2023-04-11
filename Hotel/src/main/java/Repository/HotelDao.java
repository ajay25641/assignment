package Repository;

import Modal.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HotelDao {

    private HibernateTemplate hibernateTemplate;


    public void saveHotel(Hotel hotel) {

     hibernateTemplate.save(hotel);

    }


    @Autowired
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate=hibernateTemplate;
    }

    public List<Hotel> searchHotel(String city, String pinCode) {

        List<Hotel>hotelList=hibernateTemplate.loadAll(Hotel.class);

        List<Hotel>result=new ArrayList<>();

        for(Hotel hotel:hotelList){

            if(city.equalsIgnoreCase(hotel.getCity()) || pinCode.equalsIgnoreCase(hotel.getPincode())){

                result.add(hotel);
            }
        }


        return result;

    }
}
