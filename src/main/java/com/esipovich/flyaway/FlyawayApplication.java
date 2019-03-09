package com.esipovich.flyaway;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Artem Esipovich 10.09.2018
 */

@SpringBootApplication
public class FlyawayApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlyawayApplication.class, args);
    }

}
