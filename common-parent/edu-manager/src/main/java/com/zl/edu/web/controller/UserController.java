package com.zl.edu.web.controller;

import com.zl.edu.model.User;
import com.zl.edu.service.IUserService;
import com.zl.edu.web.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhanglong0314
 * @date 2019/5/20 - 21:38
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController<User> {


    private IUserService userService;

    @RequestMapping("login")
    public String login(){
        System.out.println("你好 ..........");
        return "Default";
    }

    @RequestMapping(MANAGE)
    public String manage(){
        System.out.println("manage...");
        return MANAGE_PAGE;
    }

    @RequestMapping(INFO)
    public String info(){
        System.out.println("info...");
        return INFO_PAGE;
    }

    @RequestMapping(EDIT)
    public String edit(){
        return EDIT_PAGE;
    }

}
