package com.ranmao.demo.modules.user.controller;

import com.ranmao.demo.modules.user.entity.SysUser;
import com.ranmao.demo.modules.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ran.mao
 * @version 1.0.0.1
 * @description：TODO
 * @date 2024/10/3 23:20
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/all")
    public List<SysUser> getAllUsers() {
        return userMapper.findUsers();
    }

    @RequestMapping("/query")
    public String getQueryRequest() {
        String query = "{pageSize: 1000, pageNum: 1, query: {}}";
        return "query=";
    }
}