package com.thoughtworks.zhongtai.automation.common.zhongtai;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 中台
 * <br/> 比如：渠道中台，信贷中台等
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PACKAGE, ElementType.TYPE})
public @interface Zhongtai {

    /**
     * 中台名称
     */
    String name();

    /**
     * 中台唯一编码
     * <br/>作用: 为了避免开发者在输入/复制中台名称时出现手误/笔误以及中英文大小写等一系列不一致问题，建议使用code作为中台唯一标识
     */
    String code();
}
