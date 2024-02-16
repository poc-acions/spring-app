package com.vermeg.fluid.springbootmicroservicearchetype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.builder.SpringApplicationBuilder; 
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class SpringBootMicroServiceArchetypeApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
         return application.sources(SpringBootMicroServiceArchetypeApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringBootMicroServiceArchetypeApplication.class, args);
    }

}
