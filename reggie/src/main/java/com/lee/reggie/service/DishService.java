package com.lee.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lee.reggie.dto.DishDto;
import com.lee.reggie.pojo.Dish;

import java.util.List;

public interface DishService extends IService<Dish> {
    public void saveWithFlavor(DishDto dishDto);

    public  DishDto getByIdWithFlavor(Long id);

    public void updateWithFlavor(DishDto dishDto);

    void removeDishes(List<Long> ids);
}
