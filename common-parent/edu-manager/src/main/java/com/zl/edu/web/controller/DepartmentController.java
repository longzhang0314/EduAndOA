package com.zl.edu.web.controller;

import com.zl.edu.model.Department;
import com.zl.edu.web.controller.base.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhanglong0314
 * @date 2019/5/26 - 12:46
 */
public class DepartmentController extends BaseController<Department> {

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
