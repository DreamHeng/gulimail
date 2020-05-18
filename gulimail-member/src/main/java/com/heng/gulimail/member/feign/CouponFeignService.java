package com.heng.gulimail.member.feign;

import com.heng.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//远程服务名称
@FeignClient("gulimail-coupon")
public interface CouponFeignService {

    //远程调用服务方法的全路径和方法的全部声明
    @RequestMapping("/coupon/coupon/testOpenFeign")
    public R testOpenFeign();
}
