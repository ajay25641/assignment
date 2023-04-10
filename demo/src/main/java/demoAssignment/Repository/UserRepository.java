package demoAssignment.Repository;


import demoAssignment.Modal.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserRepository {

    //@Autowired
    private HibernateTemplate hibernateTemplate;


    @Transactional
    public int saveUser(User user) {
        int result= (Integer)hibernateTemplate.save(user);
        return result;
    }

    public List<User> getUser(){
        List<User> usersList=hibernateTemplate.loadAll(User.class);
        return usersList;
    }

    public void deleteUser(int id){
        this.hibernateTemplate.delete(id);
    }


    @Autowired
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate=hibernateTemplate;
    }
}
