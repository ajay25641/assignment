package assignment3_mvc.Repository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import assignment3_mvc.Modal.User;
import jakarta.transaction.Transactional;


public class UserRepository {
   
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
    
    //@Transactional
	public int saveUser(User user) {
		int result= (Integer)hibernateTemplate.save(user);
		return result;
	}
}
