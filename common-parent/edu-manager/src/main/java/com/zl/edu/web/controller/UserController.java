package com.zl.edu.web.controller;

import com.zl.edu.model.User;
import com.zl.edu.service.IUserService;
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
        return "User/UserManage";
    }

    @RequestMapping("info")
    public String info(){
        return "User/UserInfo";
    }

    @RequestMapping("edit")
    public String edit(){
        return "User/UserEdit";
    }

}
