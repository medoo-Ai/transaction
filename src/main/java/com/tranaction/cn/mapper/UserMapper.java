package com.tranaction.cn.mapper;


import com.tranaction.cn.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    int insertUser(User user);
    User getUser(Long uid);
}
