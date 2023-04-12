package org.assignment.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.rmi.registry.Registry;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"org.assignment"})
public class MyWebConfig implements WebMvcConfigurer {

    /*@Bean
    public InternalResourceViewResolver internalResourceViewResolver(){

        String suffix=".jsp";
        String prefix="/WEB-INF/views/";

        InternalResourceViewResolver internalResourceViewResolver=new InternalResourceViewResolver(prefix,suffix);

        //if jstl view class is not set then default view class is used which is InternalResourceView class
        //this class does not allow us to use jstl tags and el expression
        //so to generate dynamic content we have to rely on standard java code
        //which can be used in html page using <%    %> symbol
        internalResourceViewResolver.setViewClass(JstlView.class);
        return internalResourceViewResolver;
    }*/
    @Bean
    public InternalResourceViewResolver resolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

   @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry
                .addResourceHandler("/resources/**")
                .addResourceLocations("/resources/");
   }

}
