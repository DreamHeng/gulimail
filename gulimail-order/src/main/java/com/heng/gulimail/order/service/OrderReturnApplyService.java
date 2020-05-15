package com.heng.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heng.common.utils.PageUtils;
import com.heng.gulimail.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author dreamheng
 * @email dreamheng2020@163.com
 * @date 2020-05-15 21:35:17
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

