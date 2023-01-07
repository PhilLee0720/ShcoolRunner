package com.lee.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lee.reggie.common.CustomException;
import com.lee.reggie.dao.SetmealMapper;
import com.lee.reggie.dto.SetmealDto;
import com.lee.reggie.pojo.Setmeal;
import com.lee.reggie.pojo.SetmealDish;
import com.lee.reggie.service.SetmealDishService;
import com.lee.reggie.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SetmealServiceImpl extends ServiceImpl<SetmealMapper, Setmeal> implements SetmealService {
    @Autowired
    private SetmealDishService setmealDishService;
    @Override
    @Transactional
    public void saveWithDish(SetmealDto setmealDto) {
        this.save(setmealDto);
        List<SetmealDish> list = setmealDto.getSetmealDishes();
        list.stream().map((item)->{
            item.setSetmealId(setmealDto.getId());
            return item;
        }).collect(Collectors.toList());
        setmealDishService.saveBatch(list);
    }

    @Override
    public void removeWithDish(List<Long> ids) {
        LambdaQueryWrapper<Setmeal> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.in(Setmeal::getId,ids);
        queryWrapper.eq(Setmeal::getStatus,1);
        int count = this.count(queryWrapper);
        if(count > 0){
            throw new CustomException("Setmeal is not be baned");
        }
        this.removeByIds(ids);
        LambdaQueryWrapper<SetmealDish> queryWrapper2 = new LambdaQueryWrapper<>();
        queryWrapper2.in(SetmealDish::getId,ids);
        setmealDishService.remove(queryWrapper2);
    }

    @Override
    public void ban(List<Long> ids) {
        for (Long id : ids) {
            Setmeal setmeal = getById(id);
            setmeal.setStatus(0);
            updateById(setmeal);

        }
    }
}
