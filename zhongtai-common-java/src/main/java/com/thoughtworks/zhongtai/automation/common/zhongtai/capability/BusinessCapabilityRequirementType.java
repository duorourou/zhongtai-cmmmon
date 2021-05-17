package com.thoughtworks.zhongtai.automation.common.zhongtai.capability;

/**
 * 对应中台需求说明书中的《解决方案》栏目下的《一级商业能力》或者《二级商业能力》下的《商业能力需求类型》
 * <br/>目前可见的类型包括：新增、修改，同时为了健壮性增加了None类型。
 */
public enum BusinessCapabilityRequirementType {
    /**
     * 对应《新增》类型
     */
    CREATE,

    /**
     * 对应《修改》类型
     */
    MODIFY,

    /**
     * 对应《空白》或者《不确定》 类型
     */
    NONE
}
