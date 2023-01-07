package com.lee.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lee.reggie.dao.ShoppingCartMapper;
import com.lee.reggie.pojo.ShoppingCart;
import com.lee.reggie.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl  extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
