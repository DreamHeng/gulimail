package com.heng.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heng.common.utils.PageUtils;
import com.heng.gulimail.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author dreamheng
 * @email dreamheng2020@163.com
 * @date 2020-05-15 21:37:32
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

