package org.assignment.Repository;


import org.assignment.Modal.Hotel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public class HotelRepository {



    @Autowired
   SessionFactory sessionFactory;



    @Transactional
    public int saveHotel(Hotel hotel) {

        Session session;

        try{
           session=sessionFactory.getCurrentSession();
        }
        catch (HibernateException e){
           session=sessionFactory.openSession();
        }
        int result= (int) session.save(hotel);





        return result;
    }

    public List<Hotel> loadAllHotel() {

        Session session;

        try{
            session=sessionFactory.getCurrentSession();
        }
        catch (HibernateException e){
            session=sessionFactory.openSession();
        }

        String hql="from Hotel ";

        Query query=session.createQuery(hql);
        List<Hotel>hotelList=query.getResultList();



        return hotelList;

    }
}
