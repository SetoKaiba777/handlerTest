package br.com.kaiba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/hi")
    public String hiFive(){
        return "Hi Five!";
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hey brother!";
    }
}
