package com.zl.edu.web.controller;

import com.zl.edu.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhanglong0314
 * @date 2019/5/23 - 21:40
 */
@Controller
@RequestMapping("employee")
public class EmployeeController {

    //private IUserService userService;

    @RequestMapping("manage")
    public String manage(){
        return "employee/manage";
    }

    @RequestMapping("info")
    public String info(){
        return "employee/info";
    }

    @RequestMapping("edit")
    public String edit(){
        return "employee/edit";
    }
}
