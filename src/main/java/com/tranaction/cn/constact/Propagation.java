package com.tranaction.cn.constact;

import org.springframework.transaction.TransactionDefinition;

/**
 * @auther SyntacticSugar
 * @data 2019/4/2 0002下午 9:46
 */
public enum  Propagation {

    /**
     * 需要事务，它是默认传播行为，如果当前存在事务，就沿用当前事务，
     * 否则新建一个事务运行子方法
     */
    REQUIRED(TransactionDefinition.PROPAGATION_REQUIRED),

    /**
     * 支持事务，如果当前存在事务，就沿用当前事务，
     * 如果不存在，则继续采用无事务的方式运行子方法
     */
    SUPPORTS(TransactionDefinition.PROPAGATION_SUPPORTS),

    /**
     * 必须使用事务，如果当前没有事务，则会抛出异常，
     * 如果存在当前事务，就沿用当前事务
     */
    MANDATORY(TransactionDefinition.PROPAGATION_MANDATORY),

    /**
     * 无论当前事务是否存在，都会创建新事务运行方法，
     * 这样新事务就可以拥有新的锁和隔离级别等特性，与当前事务相互独立
     */
    REQUIRES_NEW(TransactionDefinition.PROPAGATION_REQUIRES_NEW),

    /**
     * 不支持事务，当前存在事务时，将挂起事务，运行方法
     */
    NOT_SUPPORTED(TransactionDefinition.PROPAGATION_NOT_SUPPORTED),

    /**
     * 不支持事务，如果当前方法存在事务，则抛出异常，否则继续使用无事务机制运行
     */
    NEVER(TransactionDefinition.PROPAGATION_NEVER),

    /**
     * 在当前方法调用子方法时，如果子方法发生异常，
     * 只回滚子方法执行过的 SQL，而不回滚当前方法的事务
     */
    NESTED(TransactionDefinition.PROPAGATION_NESTED);

    private final int value;

    Propagation(int value) { this.value = value; }

    public int value() { return this.value; }
}
