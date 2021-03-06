package com.heng.gulimail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heng.common.utils.PageUtils;
import com.heng.gulimail.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author dreamheng
 * @email dreamheng2020@163.com
 * @date 2020-05-15 21:38:18
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

