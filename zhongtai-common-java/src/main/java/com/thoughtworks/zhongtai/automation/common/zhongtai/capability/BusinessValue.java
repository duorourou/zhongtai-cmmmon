package com.thoughtworks.zhongtai.automation.common.zhongtai.capability;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 业务价值
 * <br/>(对于用户价值/对于商户价值/对于平台价值）
 * <br/>正常情况下应该区分为三个维度来完善，目前中台需求说明书中暂未看到严格区分，所以在实现的时候也进行了简化，不展开建模
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface BusinessValue {
    String detail() default "";
}
