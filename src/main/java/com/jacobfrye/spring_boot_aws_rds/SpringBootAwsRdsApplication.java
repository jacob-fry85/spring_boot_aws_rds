package com.jacobfrye.spring_boot_aws_rds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class SpringBootAwsRdsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAwsRdsApplication.class, args);
    }

}
