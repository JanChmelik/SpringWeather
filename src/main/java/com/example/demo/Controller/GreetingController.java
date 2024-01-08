package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping("")
    String hello() {
        return "Hi folks";
    }
    @RequestMapping("/greetings")
    String greeting() {
        return "Hello There.";
    }

}
