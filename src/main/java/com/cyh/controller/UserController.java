package com.cyh.controller;

import com.cyh.entity.User;
import com.cyh.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cyh
 * @Date 16:31 2018/3/30
 * @description
 * @since 2.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/queryById", method = RequestMethod.GET)
    public User queryById(@Param("id") Integer id){
      return  userService.selectByPrimaryKey(id);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public User queryById(@RequestBody User user){
        userService.insert(user);
        return userService.selectByPrimaryKey(user.getId());
    }
}
