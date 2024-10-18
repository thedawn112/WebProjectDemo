package com.ranmao.demo.modules.user.mapper;

import com.ranmao.demo.modules.user.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<SysUser> findUsers();
}
