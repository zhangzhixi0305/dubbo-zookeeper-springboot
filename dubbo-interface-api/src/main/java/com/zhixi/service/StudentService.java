package com.zhixi.service;

import com.zhixi.pojo.User;

import java.util.List;

/**
 * @ClassName StudentService
 * @Author zhangzhixi
 * @Description
 * @Date 2023-03-03 21:27
 * @Version 1.0
 */
public interface StudentService {
    /**
     * 查询所有用户
     * @return 所有用户
     */
    List<User> queryUserAll();
}
