package com.example.demotodoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoTodoAppApplication {

    @GetMapping("/hello")
    public String message(){
        return "Hello Guys, we'll develop a demo todo application. ";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoTodoAppApplication.class, args);
    }

}
