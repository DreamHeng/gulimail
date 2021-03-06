package com.heng.gulimail.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.heng.gulimail.member.entity.MemberEntity;
import com.heng.gulimail.member.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.heng.gulimail.member.entity.GrowthChangeHistoryEntity;
import com.heng.gulimail.member.service.GrowthChangeHistoryService;
import com.heng.common.utils.PageUtils;
import com.heng.common.utils.R;



/**
 * 成长值变化历史记录
 *
 * @author dreamheng
 * @email dreamheng2020@163.com
 * @date 2020-05-15 21:37:32
 */
@RefreshScope
@PropertySource(value = "classpath:my.yml", encoding = "UTF-8")
@RestController
@RequestMapping("member/growthchangehistory")
public class GrowthChangeHistoryController {
    @Autowired
    private GrowthChangeHistoryService growthChangeHistoryService;

    @Autowired
    CouponFeignService couponFeignService;

    @Value("${member.name}")
    String memberName;
    @Value("${member.age}")
    String memberAge;

    @RequestMapping("testNacosConfig")
    public R testNacosConfig(){
        return R.ok().put("name",memberName).put("age",memberAge);
    }

    @RequestMapping("testOpenFeign")
    public R testOpenFeign(){
        R r = couponFeignService.testOpenFeign();
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("小李梦");
        r.put("member",memberEntity);
        return r;
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:growthchangehistory:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = growthChangeHistoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:growthchangehistory:info")
    public R info(@PathVariable("id") Long id){
		GrowthChangeHistoryEntity growthChangeHistory = growthChangeHistoryService.getById(id);

        return R.ok().put("growthChangeHistory", growthChangeHistory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:growthchangehistory:save")
    public R save(@RequestBody GrowthChangeHistoryEntity growthChangeHistory){
		growthChangeHistoryService.save(growthChangeHistory);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:growthchangehistory:update")
    public R update(@RequestBody GrowthChangeHistoryEntity growthChangeHistory){
		growthChangeHistoryService.updateById(growthChangeHistory);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:growthchangehistory:delete")
    public R delete(@RequestBody Long[] ids){
		growthChangeHistoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
