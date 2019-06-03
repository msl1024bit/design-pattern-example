package com.liujq.demo.designpattern.behavior.interpreter;

/**
 * SQL解释器
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public abstract class SQLExpression {

    /**
     * 解释
     * @param context
     * @return
     */
    public abstract String interpret(Context context);
}
