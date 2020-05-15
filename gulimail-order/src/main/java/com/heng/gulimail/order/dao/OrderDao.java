package com.heng.gulimail.order.dao;

import com.heng.gulimail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author dreamheng
 * @email dreamheng2020@163.com
 * @date 2020-05-15 21:35:17
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
