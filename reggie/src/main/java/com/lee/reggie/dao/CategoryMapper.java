package com.lee.reggie.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lee.reggie.pojo.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
