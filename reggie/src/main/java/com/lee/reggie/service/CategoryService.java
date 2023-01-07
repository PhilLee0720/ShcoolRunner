package com.lee.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lee.reggie.pojo.Category;

public interface CategoryService extends IService<Category> {
    void remove(Long id);
}
