package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public Map hello(){
        Map hashMap = new HashMap();
        hashMap.put("hello","hello wold");
        return hashMap;
    }
}
