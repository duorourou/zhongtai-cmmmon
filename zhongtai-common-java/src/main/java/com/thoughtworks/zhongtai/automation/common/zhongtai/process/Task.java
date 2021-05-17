package com.thoughtworks.zhongtai.automation.common.zhongtai.process;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * L5任务
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Task {

    /**
     * L5任务编码，目前通用模板中暂时没有这个字段，增加该字段目的是为了防止仅仅通过名称来判断是否同一个任务
     *
     * @return code
     */
    String code();

    /**
     * L5任务名称,目前《XX业务中台需求说明书》中只有一个字段来描述任务。暂且对应为name
     *
     * @return name
     */
    String name();

    Activity activity() default @Activity;
}
