package com.tranaction.cn.controller;

import com.tranaction.cn.pojo.User;
import com.tranaction.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther SyntacticSugar
 * @data 2019/4/1 0001下午 8:53
 */
@RestController
public class Controller {

    @Autowired
    private UserService userService;

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


}
