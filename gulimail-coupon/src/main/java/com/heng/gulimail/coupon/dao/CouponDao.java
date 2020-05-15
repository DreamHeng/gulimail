package com.heng.gulimail.coupon.dao;

import com.heng.gulimail.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author dreamheng
 * @email dreamheng2020@163.com
 * @date 2020-05-15 21:36:24
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
