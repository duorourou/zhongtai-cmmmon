package com.thoughtworks.zhongtai.automation.common.zhongtai.capability;

import com.thoughtworks.zhongtai.automation.common.zhongtai.ValueStream;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 对应中台需求说明书中的《解决方案》栏目下的《一级商业能力》和《二级商业能力》
 * <br/>目前的中台方法论中商业能力只有两级。
 * <br>但在多个《XXX中台需求说明书》中均很少看到一级商业能力具体信息，大部分为二级商业能力。
 *
 * <br/>商业能力英文缩写: BC
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BusinessCapability {

    /**
     * 基础信息, 包括 名称、级别
     */
    MetaInfo info();

    /**
     * 商业能力需求
     */
    BusinessCapabilityRequirement requirement();

    /**
     * 所属价值流
     */
    ValueStream valueStream();
}
