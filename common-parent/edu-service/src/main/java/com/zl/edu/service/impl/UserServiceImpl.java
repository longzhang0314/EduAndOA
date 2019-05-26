package com.zl.edu.service.impl;

import com.zl.edu.model.User;
import com.zl.edu.service.IUserService;
import com.zl.edu.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhanglong0314
 * @date 2019/5/20 - 22:39
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService<User> {


    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> findByUUID(String uuid) {
        return userMapper.selectByUUID(uuid);
    }


//    @Override
//    public User findByUUID(String uuid) {
//        return null;
//    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByUUID(String uuid) {

    }

    @Override
    public void save(User user) {

    }

    @Override
    public void update(User user) {

    }
}
