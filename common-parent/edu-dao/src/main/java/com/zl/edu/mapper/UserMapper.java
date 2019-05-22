package com.zl.edu.mapper;

import com.zl.edu.mapper.base.BaseMapper;
import com.zl.edu.model.User;

/**
 * @author zhanglong0314
 * @date 2019/5/20 - 21:45
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 通过id查找用户
     */
    public User findById(Integer id);


}
