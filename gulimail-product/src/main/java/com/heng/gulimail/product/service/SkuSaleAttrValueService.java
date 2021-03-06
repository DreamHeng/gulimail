package com.heng.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heng.common.utils.PageUtils;
import com.heng.gulimail.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author dreamheng
 * @email dreamheng2020@163.com
 * @date 2020-05-15 21:32:14
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

