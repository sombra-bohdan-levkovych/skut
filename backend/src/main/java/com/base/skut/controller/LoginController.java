package com.base.skut.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping(value = "/login")
    public void login(){
        System.out.println("login came");
    }

}
