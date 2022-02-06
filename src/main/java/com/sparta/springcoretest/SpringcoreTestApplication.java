package com.sparta.springcoretest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@ServletComponentScan
@SpringBootApplication
public class SpringcoreTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcoreTestApplication.class, args);
    }

}
