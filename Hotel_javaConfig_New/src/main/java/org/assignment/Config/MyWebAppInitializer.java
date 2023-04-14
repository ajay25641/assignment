package org.assignment.Config;

import jakarta.servlet.ServletContext;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


public class MyWebAppInitializer implements WebApplicationInitializer {

    public void onStartup(ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(AppConfig.class);
        context.register(HibernateConfig.class);


        DispatcherServlet servlet=new DispatcherServlet(context);
        ServletRegistration.Dynamic registration=servletContext.addServlet("spring",servlet);

        registration.setLoadOnStartup(1);
        registration.addMapping("/");



    }


}
