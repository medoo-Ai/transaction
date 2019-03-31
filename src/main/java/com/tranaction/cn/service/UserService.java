package com.tranaction.cn.service;

import com.tranaction.cn.pojo.User;

public interface UserService {
    public User getUser(Long id);
    // 新增用户
    public int insertUser(User user) ;

}
