package com.thoughtworks.zhongtai.automation.common.zhongtai.capability;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 商业能力需求英文缩写: BCR
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface BusinessCapabilityRequirement {

    /**
     * 商业能力需求编号
     * <br/>e.g. : BC-LOAN-001
     */
    String code();

    /**
     * 商业能力需求类型
     * <br/>e.g. : 新增
     */
    BusinessCapabilityRequirementType type();

    /**
     * 商业能力需求说明
     * <br/>e.g. : 新增贷款额度申请商业能力
     */
    String description();
}
