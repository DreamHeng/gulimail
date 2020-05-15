package com.heng.gulimail.product.dao;

import com.heng.gulimail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author dreamheng
 * @email dreamheng2020@163.com
 * @date 2020-05-15 21:32:14
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
