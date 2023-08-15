package com.lz.youtuan.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lz.youtuan.entity.Dish;
import com.lz.youtuan.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishFlavorMapper extends BaseMapper<DishFlavor> {
}
