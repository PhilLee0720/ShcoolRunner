package com.lee.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lee.reggie.pojo.Orders;
import org.springframework.stereotype.Service;

@Service
public interface OrdersService extends IService<Orders> {
    public void submit(Orders orders);
}
