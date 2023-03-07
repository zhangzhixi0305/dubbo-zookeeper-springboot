package com.zhixi.service.impl;

import com.zhixi.mapper.StudentMapper;
import com.zhixi.pojo.User;
import com.zhixi.service.StudentService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName StudentServiceImpl
 * @Author zhangzhixi
 * @Description
 * @Date 2023-03-03 21:32
 * @Version 1.0
 */
@DubboService(interfaceClass = StudentService.class, version = "1.0.0")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<User> queryUserAll() {
        return studentMapper.queryUserAll();
    }
}
