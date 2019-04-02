package com.tranaction.cn.service.impl;

import com.tranaction.cn.mapper.UserMapper;
import com.tranaction.cn.pojo.User;
import com.tranaction.cn.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @auther SyntacticSugar
 * @data 2019/3/31 0031下午 10:58
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;


    @Override
    public User getUser(Long id) {
        log.info(" getUser {}",id);
        return this.userMapper.getUser(id);
    }

    /**
     * SERIALIZABLE 阻止了事务并发
     * @param user
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.SERIALIZABLE)
    public int insertUser(User user) {
        log.info(" insertUser {}",user);
        return this.userMapper.insertUser(user);
    }
}
