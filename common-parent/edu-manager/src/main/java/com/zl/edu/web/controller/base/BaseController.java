package com.zl.edu.web.controller.base;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author zhanglong0314
 * @date 2019/5/25 - 17:26
 */
public abstract class BaseController<T> {
    public static final String MANAGE = "manage";
    public static final String UPDATE = "update";
    public static final String INFO = "info";
    public static final String EDIT = "edit";

    public static String MANAGE_PAGE;
    public static String UPDATE_PAGE;
    public static String INFO_PAGE;
    public static String EDIT_PAGE;

    public BaseController(){
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        Class<?> modelClass = (Class<?>) type.getActualTypeArguments()[0];
        String name = modelClass.getSimpleName().toLowerCase();

        MANAGE_PAGE = name +"/"+MANAGE;
        UPDATE_PAGE = name +"/"+UPDATE;
        INFO_PAGE = name +"/"+INFO;
        EDIT_PAGE = name +"/"+EDIT;
    }

}
