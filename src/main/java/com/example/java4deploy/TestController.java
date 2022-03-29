package com.example.java4deploy;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public String get() {
        return "hello";
    }

    private void ha(){
        System.out.println("ha");
    }

}
