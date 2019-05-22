package com.zl.edu.mapper.base;

/**
 * @author zhanglong0314
 * @date 2019/5/20 - 21:46
 */
public interface BaseMapper<T> {

    public T findById(Integer id);
    public T findByUUID(String uuid);
    public void deleteById(Integer id);
    public void deleteByUUID(String uuid);
    public void save(T t);
    public void update(T t);
}
