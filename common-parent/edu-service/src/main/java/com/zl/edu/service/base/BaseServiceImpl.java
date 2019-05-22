package com.zl.edu.service.base;

import com.zl.edu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhanglong0314
 * @date 2019/5/20 - 22:34
 */
public abstract class BaseServiceImpl<T> implements IBaseService<T> {

    @Autowired
    protected UserMapper userMapper;

}
