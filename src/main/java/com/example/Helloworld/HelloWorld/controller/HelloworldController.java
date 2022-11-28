package com.example.Helloworld.HelloWorld.controller;

import com.example.Helloworld.HelloWorld.service.helloworldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    @Autowired
    helloworldService service;

    public String PrintHelloWorld(){
        return service.helloWorldService();
    }
}
