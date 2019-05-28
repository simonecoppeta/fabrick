package com.test_fabrick.fabrick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@SpringBootApplication(scanBasePackages = "com.test_fabrick.fabrick")
public class RunApp extends SpringBootServletInitializer implements WebApplicationInitializer {

    public static void main(String[] args) {
        SpringApplication.run(RunApp.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(RunApp.class);
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        String profileProperty = "spring.profiles.active";
        String environment = System.getProperty("Environment").toLowerCase();
        servletContext.setInitParameter(profileProperty, environment);
        super.onStartup(servletContext);
    }
}
