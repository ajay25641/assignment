package org.assignment.Repository;

import org.assignment.Modal.Hotel;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.*;

import java.util.List;



@Repository
public class HotelRepository {

    @Autowired
    SessionFactory sessionFactory;
    public int saveHotel(Hotel hotel) {

        Session session=sessionFactory.getCurrentSession();
        int result= (int) session.save(hotel);

        return 0;
    }

    public List<Hotel> loadAllHotel() {

        Session session=sessionFactory.getCurrentSession();

       String hql="from Hotel ";

        Query query=session.createQuery(hql);


        List<Hotel>hotelList=query.getResultList();

        return null;

    }
}
