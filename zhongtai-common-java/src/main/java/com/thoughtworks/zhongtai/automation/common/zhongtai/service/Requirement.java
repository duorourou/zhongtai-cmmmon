package com.thoughtworks.zhongtai.automation.common.zhongtai.service;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Requirement {
    /**
     * 业务服务需求编号
     */
    String code();
    /**
     * 业务服务需求类型
     */
    String type();
    /**
     * 业务服务需求说明
     */
    String description();
}
