package com.thoughtworks.zhongtai.automation.common.zhongtai.solution;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 按照中台需求说明书，解决方案需求缩写为: SLR
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface SolutionRequirement {
    /**
     * 对应中台需求说明书中的《解决方案》栏目下的《解决方案需求编号》
     * <br/>e.g. : SLR-LOAN-001
     */
    String code();

    /**
     * 对应中台需求说明书中的《解决方案》栏目下的《解决方案需求类型》
     * <p/>目前在材料中看到的只有新增和修改
     * <br/>e.g. : 新增/修改
     */
    RequirementType type();

    /**
     * 对应中台需求说明书中的《解决方案》栏目下的《解决方案需求说明》
     * <br/>e.g. : 增加“额度申请前置检查”、“额度激活前置检查”任务、能力项、业务服务
     */
    String description();

}
