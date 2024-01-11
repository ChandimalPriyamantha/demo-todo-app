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

    @GetMapping("/ganidu")
    public  String getMessage(){
        return "I have a plain to continue our project. I cna ensure that our project will be success.";
    }

    @GetMapping("/lakindu")
    public  String getMessageToLakindu(){
        return "If we have a cloud infrastructure, It will be esy to continue our project.";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoTodoAppApplication.class, args);
    }

}
