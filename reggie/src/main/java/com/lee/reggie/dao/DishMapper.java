package com.lee.reggie.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lee.reggie.pojo.Dish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
