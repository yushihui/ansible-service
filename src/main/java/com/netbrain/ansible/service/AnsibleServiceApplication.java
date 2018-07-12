package com.netbrain.ansible.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@EnableEurekaClient
@SpringBootApplication
public class AnsibleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnsibleServiceApplication.class, args);
    }
}