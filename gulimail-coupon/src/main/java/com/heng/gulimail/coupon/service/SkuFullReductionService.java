package com.heng.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heng.common.utils.PageUtils;
import com.heng.gulimail.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author dreamheng
 * @email dreamheng2020@163.com
 * @date 2020-05-15 21:36:24
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

