package com.cyh.dao;

import com.cyh.entity.User;

/**
 * @author cyh
 * @Date 15:25 2018/3/30
 * @description
 * @since 2.0
 */
public interface UserDao {

    int insert(User user);
    int deleteByKey(Integer id);
    int update(User user);
    User selectByPrimaryKey(Integer id);
}
