package com.lee.reggie.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lee.reggie.pojo.ShoppingCart;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShoppingCartMapper extends BaseMapper<ShoppingCart> {
}
