package com.ashu.oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    //In postman both works -
    //Authorization tab -> OAuth2.0 -> configure new token for client creds -> generate new token -> use token
    //Or
    //Headers -> Authorization Bearer <<bearer token generated above>>

    @GetMapping
    public String hello(){
        return "Hello";
    }
}
