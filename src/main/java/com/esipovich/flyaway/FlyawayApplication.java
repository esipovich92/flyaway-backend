package com.esipovich.flyaway;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Artem Esipovich 10.09.2018
 */

@EnableAutoConfiguration
@RestController
public class FlyawayApplication {

    @RequestMapping("/")
    String home() {
        return "Welcome to FlyAway!";
    }

    public static void main(String[] args) {
        SpringApplication.run(FlyawayApplication.class, args);
    }

}
