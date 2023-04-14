package org.assignment.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@Configuration
@EnableWebMvc
@ComponentScan("org.assignment")
public class AppConfig implements WebMvcConfigurer {

@Bean
    public InternalResourceViewResolver viewResolver(){
    InternalResourceViewResolver internalResourceViewResolver=new InternalResourceViewResolver();

    internalResourceViewResolver.setViewClass(JstlView.class);
    internalResourceViewResolver.setPrefix("/WEB-INF/views/");
    internalResourceViewResolver.setSuffix(".jsp");

    return internalResourceViewResolver;

}



}
