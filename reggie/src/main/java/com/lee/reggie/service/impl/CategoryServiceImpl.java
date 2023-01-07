package com.lee.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lee.reggie.common.CustomException;
import com.lee.reggie.dao.CategoryMapper;
import com.lee.reggie.pojo.Category;
import com.lee.reggie.pojo.Dish;
import com.lee.reggie.pojo.Setmeal;
import com.lee.reggie.service.CategoryService;
import com.lee.reggie.service.DishService;
import com.lee.reggie.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
    @Autowired
    private DishService dishService;
    @Autowired
    private SetmealService setmealService;
    @Override
    public void remove(Long id){
        LambdaQueryWrapper<Dish> dishQueryWrapper = new LambdaQueryWrapper<>();
        dishQueryWrapper.eq(Dish::getCategoryId,id);
        int dishCount = dishService.count(dishQueryWrapper);
        if(dishCount > 0){
            throw new CustomException("Can't delete because the category is connect with a dish");
        }
        LambdaQueryWrapper<Setmeal> setmealQueryWrapper = new LambdaQueryWrapper<>();
        setmealQueryWrapper.eq(Setmeal::getCategoryId,id);
        int setmealCount = setmealService.count(setmealQueryWrapper);
        if(setmealCount > 0){
            throw new CustomException("Can't delete because the category is connect with a setmeal");
        }
        this.removeById(id);
    }
}
