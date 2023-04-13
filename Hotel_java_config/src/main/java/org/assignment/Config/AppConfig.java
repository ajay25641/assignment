package org.assignment.Config;



import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"org.assignment"})
public class AppConfig implements WebMvcConfigurer {

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    public class ServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

        @Override
        protected Class<?>[] getRootConfigClasses() {
            return new Class[] {AppConfig.class};
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
            return null;
        }

        @Override
        protected String[] getServletMappings() {
            return new String[] {"/Hotel_java_config_war_exploded/"};
        }

        @Override
        protected DispatcherServlet createDispatcherServlet(WebApplicationContext servletAppContext) {
            final DispatcherServlet dispatcherServlet = new DispatcherServlet(servletAppContext);
            dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
            return dispatcherServlet;
        }
    }
}

