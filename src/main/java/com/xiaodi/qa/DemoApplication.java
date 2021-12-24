package com.xiaodi.qa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
//@SpringBootApplication(exclude = {QuartzAutoConfiguration.class})
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private String REQ_URL;

    private String SECRET;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("REQ_URL");
        System.out.println("SECRET");
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
