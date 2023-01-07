package com.lee.reggie.dto;

import com.lee.reggie.pojo.Setmeal;
import com.lee.reggie.pojo.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
