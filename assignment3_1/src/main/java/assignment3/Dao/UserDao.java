package assignment3.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import assignment3.Modal.User;
import jakarta.transaction.Transactional;


@Repository
public class UserDao {
	
    @Autowired
	private HibernateTemplate hibernateTemplate;
	
    
    @Transactional
	public int saveUser(User user) {
		int result= (Integer)hibernateTemplate.save(user);
		return result;
	}
	
}
