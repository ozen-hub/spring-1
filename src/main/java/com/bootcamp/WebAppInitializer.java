package com.bootcamp;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.Registration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebAppInitializer implements WebApplicationInitializer {

    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context =
                new AnnotationConfigWebApplicationContext();
        context.register(WebMvcConfig.class);
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet(
                "SpringDispatcher",new DispatcherServlet(context)
        );
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }
}
