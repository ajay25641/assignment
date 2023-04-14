package org.assignment.Config;

import org.assignment.Modal.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

@Configuration
@PropertySource("classpath:database.properties")
@EnableTransactionManagement
public class HibernateConfig {


    @Autowired
    private Environment env;

    @Bean
    public DriverManagerDataSource dataSource(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();

        dataSource.setDriverClassName(env.getRequiredProperty("DB_driverClassName"));
        dataSource.setUrl(env.getRequiredProperty("DB_URL"));
        dataSource.setUsername(env.getRequiredProperty("DB_USERNAME"));
        dataSource.setPassword(env.getRequiredProperty("DB_PASSWORD"));

        return dataSource;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory(){
        LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();

        sessionFactory.setDataSource(dataSource());
        sessionFactory.setHibernateProperties(getHibernateProperties());
        //sessionFactory.setPackagesToScan(new String[]{"org.assignment.Modal"});
        sessionFactory.setAnnotatedClasses(new Class[]{Hotel.class});

        System.out.println(sessionFactory.getHibernateProperties());


        return sessionFactory;
    }

    private Properties getHibernateProperties(){
        Properties properties=new Properties();

        properties.setProperty("hibernate.dialect","org.hibernate.dialect.PostgreSQLDialect");
        properties.setProperty("hibernate.hbm2ddl.auto","update");
        properties.setProperty("hibernate.show_sql","true");

        return properties;

    }


    @Bean
    public HibernateTransactionManager hibernateTransactionManager(){

        HibernateTransactionManager hibernateTransactionManager=new HibernateTransactionManager();
        hibernateTransactionManager.setSessionFactory(sessionFactory().getObject());

        return hibernateTransactionManager;


    }

}

