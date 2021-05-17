package com.thoughtworks.zhongtai.automation.common.zhongtai.solution;

/**
 * 对应中台需求说明书中的《解决方案》栏目下的《解决方案需求类型》
 * <br/>目前可见的类型包括：新增、修改，同时为了健壮性增加了None类型。
 */
public enum RequirementType {
    /**
     * 新增
     */
    CREATE,
    /**
     * 修改
     */
    MODIFY,
    /**
     * 无
     */
    NONE
}
