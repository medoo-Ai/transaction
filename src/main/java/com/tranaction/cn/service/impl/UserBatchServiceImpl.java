package com.tranaction.cn.service.impl;

import com.tranaction.cn.pojo.User;
import com.tranaction.cn.service.UserBatchService;
import com.tranaction.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @auther SyntacticSugar
 * @data 2019/4/2 0002下午 9:49
 */
@Service
public class UserBatchServiceImpl implements UserBatchService {
    @Autowired
    private UserService userService;

    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    @Override
    public int insertUsers(List<User> users) {
        int count = 0;
        for (User user : users) {
            count += userService.insertUser(user);
        }
        return count;
    }
}
