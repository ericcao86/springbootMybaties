package com.cyh.service;

import com.cyh.dao.UserDao;
import com.cyh.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author cyh
 * @Date 16:25 2018/3/30
 * @description
 * @since 2.0
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public User selectByPrimaryKey(Integer id){
        return userDao.selectByPrimaryKey(id);
    }

    public void insert(User user){
        userDao.insert(user);
    }
}
