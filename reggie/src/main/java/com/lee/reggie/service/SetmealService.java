package com.lee.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lee.reggie.dto.SetmealDto;
import com.lee.reggie.pojo.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    public void saveWithDish(SetmealDto setmealDto);

    public void removeWithDish(List<Long> ids);


    void ban(List<Long> ids);
}
