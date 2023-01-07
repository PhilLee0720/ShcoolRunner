package com.lee.reggie.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lee.reggie.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
