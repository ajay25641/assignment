package org.assignment.Config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value="classpath:database.properties")
public class HibernateConfig {
}
