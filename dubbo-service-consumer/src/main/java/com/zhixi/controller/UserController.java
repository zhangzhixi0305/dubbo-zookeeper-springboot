package com.zhixi.controller;

import com.zhixi.pojo.User;
import com.zhixi.service.StudentService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Author zhangzhixi
 * @Description
 * @Date 2023-03-03 21:45
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @DubboReference(version = "1.0.0")
    private StudentService studentService;

    @GetMapping("/queryUserAll")
    public List<User> queryUserAll() {
        return studentService.queryUserAll();
    }
}
