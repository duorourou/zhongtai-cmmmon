package com.thoughtworks.zhongtai.automation.common.zhongtai.capability;

public @interface MetaInfo {

    /**
     * 商业能力级别，由于目前看到的方案设计中，绝大多数（几乎全部）为二级商业能力，所以默认为L2
     * <br/>e.g. : L2
     */
    Level level() default Level.L2;

    /**
     * 商业能力名称
     * <br/>e.g. : 贷款额度申请
     */
    String name();

    /**
     * 业务价值
     */
    BusinessValue value();
}
