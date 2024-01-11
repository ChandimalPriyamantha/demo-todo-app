package com.example.demotodoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoTodoAppApplication {

    @GetMapping("/tharuka")
    public String message(){
        return "Hi, Tharuka, I love you..!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoTodoAppApplication.class, args);
    }

}
