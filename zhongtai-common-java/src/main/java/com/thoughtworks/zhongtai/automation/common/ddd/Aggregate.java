package com.thoughtworks.zhongtai.automation.common.ddd;

@AggregateRoot
@DomainEntity(isAggregateRoot = true)
public abstract class Aggregate<T> extends Entity<T> {
    @Id
    private T id;

    @Override
    public T getId() {
        return id;
    }
}
