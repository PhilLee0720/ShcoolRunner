package com.lee.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lee.reggie.dao.DishFlavorMapper;
import com.lee.reggie.pojo.DishFlavor;
import com.lee.reggie.service.DishFlavorService;
import com.lee.reggie.service.DishService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
