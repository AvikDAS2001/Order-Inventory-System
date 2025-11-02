package com.projects;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class InventoryManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(InventoryManagementApplication.class);
        System.out.println("Hello, World!");
    }
}