package com.zl.edu.service.base;

import java.util.List;

/**
 * @author zhanglong0314
 * @date 2019/5/20 - 22:34
 */
public interface IBaseService<T> {

    public T selectByPrimaryKey(Integer id);
    public List<T> findByUUID(String uuid);
    public void deleteById(Integer id);
    public void deleteByUUID(String uuid);
    public void save(T t);
    public void update(T t);

}
