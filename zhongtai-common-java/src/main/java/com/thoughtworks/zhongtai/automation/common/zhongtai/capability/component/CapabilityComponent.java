package com.thoughtworks.zhongtai.automation.common.zhongtai.capability.component;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 能力组件
 * <br/> 一组能力项按照某种规则的排列组合
 * <p>
 * 由于在现实生活中，一些业务场景需要具备原子性，但这些业务场景本身有涉及多个不同的子操作，所以就有了能力组件的概念。
 * <br/>能力组件目的是把一组不同的操作按照某个规则进行串联形成固定的业务规则，对外看来像形成了一个新的能力（多个能力项合并）
 * <br>比如一个能力组件可以是：额度激活
 * <br/>该场景需要按照顺序对不同的领域对象进行操作:
 * <ol>
 *     <li>激活额度</li>
 *     <li>生成贷款(涉及到合同签订等一些列操作)</li>
 *     <li>新增金融交易登记（交易类型=贷款-额度激活）</li>
 * </ol>
 * 其中:
 * <br/><i>激活额度</i>需要在<b>订单中心</b>中对<b>贷款额度</b>进行操作，
 * <br/><em>生成贷款</em>需要<b>订单中心</b>的<b>贷款模型</b>进行处理，
 * <br/><i>新增金融交易登记</i>则需要<b>订单中心下</b>的<b>金融交易登记</b>来处理
 * </p>
 * <br/>当然不是所有的业务场景都涉及到对多个领域模型的操作，所以能力组件并不是一定存在。
 * <br/>
 * <br/>按照中台需求说明书，能力组件英文缩写为: CC , 能力组件需求英文缩写为 : CCR
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface CapabilityComponent {

    /**
     * 能力组件名称
     * <br/>e.g. : 获取客户所有可购和已购贷款商品列表
     *
     * @return name
     */
    String name() default "";

    /**
     * 能力组件需求编号,即CCR编码
     *
     * @return requirementCode
     */
    String requirementCode() default "";

    /**
     * 能力组件需求类型,即CCR类型
     *
     * @return requirementType
     */
    String requirementType() default "";

}
