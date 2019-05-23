package com.zl.edu.web.controller;

import com.zl.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhanglong0314
 * @date 2019/5/20 - 21:38
 */
@Controller
@RequestMapping("user")
public class UserController {


    private IUserService userService;

    @RequestMapping("login")
    public String login(){
        System.out.println("你好 ..........");
        return "Default";
    }

    @RequestMapping("manage")
    public String manage(){
        System.out.println("manage...");
        return "user/manage";
    }

    @RequestMapping("info")
    public String info(){
        System.out.println("info...");
        return "user/info";
    }

    @RequestMapping("edit")
    public String edit(){
        return "user/edit";
    }

}
