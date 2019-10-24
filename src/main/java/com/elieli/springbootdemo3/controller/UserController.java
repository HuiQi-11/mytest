package com.elieli.springbootdemo3.controller;

import com.elieli.springbootdemo3.eneity.Result;
import com.elieli.springbootdemo3.eneity.User;
import com.elieli.springbootdemo3.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: huiqi
 * @CreateTime: 2019-10-24 15:06
 */
@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userServiceimpl;

    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    public Result regist(User user){
        System.out.println("regist");
        return userServiceimpl.regist(user);
    }

    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    public Result login(User user){
        System.out.println("login");
        return userServiceimpl.login(user);
    }



}

