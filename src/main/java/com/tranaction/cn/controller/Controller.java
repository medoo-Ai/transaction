package com.tranaction.cn.controller;

import com.tranaction.cn.pojo.User;
import com.tranaction.cn.service.UserBatchService;
import com.tranaction.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther SyntacticSugar
 * @data 2019/4/1 0001下午 8:53
 */
@RestController
public class Controller {

    @Autowired
    private UserService userService;
    @Autowired
    private UserBatchService userBatchService;

    @RequestMapping("insertUser")
    public Map<String, Object> insertUser(User user){
        int i = userService.insertUser(user);
        Map<String, Object> map = new HashMap<>();
        map.put("success",i==1);
        map.put("user",user);
        return map;
    }

    @RequestMapping("selectUser")
    public User selectUser(Long  uid){
        return userService.getUser(uid);
    }

    @RequestMapping("insertUsers")
    public Map<String, Object> insertUsers(List<User> users){
        // new users
        User user = new User();
        user.setNote("hello");
        user.setUserName("lisi");
        users.add(user);
        users.add(user);

        int i = userBatchService.insertUsers(users);
        Map<String, Object> map = new HashMap<>();
        map.put("success",i>1);
        map.put("user",users);
        return map;
    }

}
