package com.thoughtworks.zhongtai.automation.common.zhongtai.process;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * L3子流程
 * <br/> 一个二级商业能力包含1个或多个子流程
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Process {

    /**
     * L3子流程编码，目前通用模板中暂时没有这个字段，增加该字段目的是为了防止仅仅通过名称来判断是否同一个子流程
     * @return code
     */
    String code() default "";


    /**
     * L3子流程,目前《XX业务中台需求说明书》中只有一个字段来描述子流程。暂且对应为name
     * @return code
     */
    String name() default "";


}
