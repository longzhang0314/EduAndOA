package com.zl.edu.web.controller;

import com.zl.edu.model.User;
import com.zl.edu.service.IUserService;
import com.zl.edu.web.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author zhanglong0314
 * @date 2019/5/20 - 21:38
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController<User> {

    @Autowired
    @Qualifier("userService")
    private IUserService userService;


    @RequestMapping("login")
    public String login(HttpServletRequest request,String username,String password){



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

    @RequestMapping("find")
    public String find(HttpServletRequest request, HttpServletResponse response){

        String username = request.getParameter("username");
        List<User> userList = userService.findByUUID(username);
//        request.getSession().setAttribute("userList",userList);

        request.setAttribute("userList",userList);

        return INFO_PAGE;


    }


}
