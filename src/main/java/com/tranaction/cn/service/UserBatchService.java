package com.tranaction.cn.service;

import com.tranaction.cn.pojo.User;

import java.util.List;

/**
 * @auther SyntacticSugar
 * @data 2019/4/2 0002下午 9:47
 */
public interface UserBatchService {
  int insertUsers(List<User> users);
}
