package com.thoughtworks.zhongtai.automation.common.zhongtai.solution;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 解决方案
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Solution {
    /**
     * 对应中台需求说明书中的《解决方案需求汇总表》栏目下的《解决方案名称》
     * <br/>e.g. : 渠道中台贷款解决方案1
     */
    String name();

    /**
     * 对应中台需求说明书中的《解决方案需求汇总表》栏目下的《解决方案说明》
     * <br/>e.g. : 内部产品+自有渠道
     */
    String description();

    /**
     * 对应中台需求说明书中的《解决方案需求汇总表》栏目下的《解决方案需求XXX》栏
     */
    SolutionRequirement requirement();

    /**
     * 归属信息，标记和中台映射关系
     * <br/>默认可以为空，会根据Zhongtai的注解进行关联。
     */
    String zhongtai() default "";
}
