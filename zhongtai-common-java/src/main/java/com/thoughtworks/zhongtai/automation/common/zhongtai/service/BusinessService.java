package com.thoughtworks.zhongtai.automation.common.zhongtai.service;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 业务服务
 * <br/>通常以Rest-API的形式存在，所以在设计的时候想通过在API上添加注解的方式来声明即可，不对该API本身做太多限制和要求。
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface BusinessService {


    /**
     * 业务服务code
     * <br/> 增加code防止名称重复或者出现笔误等
     */
    String code();

    /**
     * 业务服务名称
     */
    String name();

    /**
     * 业务服务需求
     *
     * @return 业务服务需求
     */
    Requirement requirement();
}
