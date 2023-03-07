package com.zhixi.mapper;

import com.zhixi.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName StudentMapper
 * @Author zhangzhixi
 * @Description
 * @Date 2023-03-03 21:32
 * @Version 1.0
 */
@Repository
public interface StudentMapper {
    /**
     * 查询所有用户
     * @return 所有用户
     */
    List<User> queryUserAll();
}
