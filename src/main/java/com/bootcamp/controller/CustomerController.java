package com.bootcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/v1/customer")
public class CustomerController {
//=====>http://localhost:8080/api/v1/customer ==> get

    @GetMapping
    public String init(){
        return "Hello!, this is my first Spring app";
    }

}
