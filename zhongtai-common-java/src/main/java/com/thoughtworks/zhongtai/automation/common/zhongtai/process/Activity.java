package com.thoughtworks.zhongtai.automation.common.zhongtai.process;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * L4业务活动
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Activity {

    /**
     * L4业务活动编码，目前通用模板中暂时没有这个字段，增加该字段目的是为了防止仅仅通过名称来判断是否同一个业务活动
     *
     * @return code
     */
    String code() default "";

    /**
     * L4业务活动名称,目前《XX业务中台需求说明书》中只有一个字段来描述业务活动。暂且对应为name
     *
     * @return name
     */
    String name() default "";

    Process process() default @Process;
}
