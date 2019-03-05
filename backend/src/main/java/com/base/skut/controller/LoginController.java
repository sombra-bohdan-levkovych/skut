package com.base.skut.controller;

import com.base.skut.entity.Permission;
import com.base.skut.entity.User;
import com.base.skut.repository.PermissionRepository;
import com.base.skut.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class LoginController {


    @Autowired
    private UserRepository userRepository;


    @Autowired
    private PermissionRepository permissionRepository;

    @RequestMapping(value = "/login")
    public void login(){


    }

}
