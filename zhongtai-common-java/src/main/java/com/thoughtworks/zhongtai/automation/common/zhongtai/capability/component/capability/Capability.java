package com.thoughtworks.zhongtai.automation.common.zhongtai.capability.component.capability;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 能力项
 * <br/> 一个能力组件包含多个能力项
 * <p>能力组件和能力项有点类似DDD中ApplicationService和DomainModel之间的关系，一个能力组件类似一个相对比较小的user case，
 * 而能力项则类似于某个Model上的最小能力（方法）,能力项要发挥价值需要被能力组件进行包装。
 * </p>
 * <br/>
 * Sample1:<br/>
 * 比如一个能力组件可以是：<b>查询贷款商品详情</b>
 * <br/>而该能力组件下面包含了三个能力项分别为：
 * <ol>
 * <li>查询借款人信息（原查看客户信息）</li>
 * <li>查询贷款额度</li>
 * <li>查询借款人可用账户信息</li>
 * </ol>
 * <br/>
 * <br/>
 * 当然有些能力项也可以直接被业务服务所使用，不一定非要进行能力组件的封装<br/>
 * Sample2:<br/>
 * 比如一个能力项可以是：<b>提交自然人贷款担保额度申请</b>
 * <br/>由于该能力项可以独立完成某个小场景需求，所以不需要进行能力组件封装。
 * <br/><br/>不过因为目前中台方法论并不是很完善，还会随着对业务和架构的理解而不断的进行优化和重构，同时由于业内还未有具体某个项目严格按照该方法论进行落地，
 * 在落地过程中是否会出现大量的问题导致目前的设计和关联关系出现巨大的变化依然是个未知数。
 * <br/>
 * <br/> 按照中台需求说明书，能力项英文缩写为: CA, 能力项需求英文缩写为: CAR
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Capability {
    /**
     * 能力项名称
     * <br/>e.g. : 获取客户所有可购和已购贷款商品列表
     *
     * @return name
     */
    String name();
}
