package com.heng.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heng.common.utils.PageUtils;
import com.heng.gulimail.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author dreamheng
 * @email dreamheng2020@163.com
 * @date 2020-05-15 21:32:14
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

