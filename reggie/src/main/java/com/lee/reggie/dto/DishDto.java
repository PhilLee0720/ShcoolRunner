package com.lee.reggie.dto;

import com.lee.reggie.pojo.Dish;
import com.lee.reggie.pojo.DishFlavor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class DishDto extends Dish {
    private List<DishFlavor> flavors = new ArrayList<>();
    private String CategoryName;
    private Integer copies;
}
