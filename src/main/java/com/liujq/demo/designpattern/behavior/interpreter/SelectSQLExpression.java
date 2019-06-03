package com.liujq.demo.designpattern.behavior.interpreter;

/**
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class SelectSQLExpression extends SQLExpression {
    @Override
    public String interpret(Context context) {
        StringBuilder select = new StringBuilder();
        select.append("select * from ")
                .append(context.getTableName())
                .append(" where ")
                .append(" 1 = 1 ");
        for (String key : context.getWheres().keySet()) {
            select.append(" and ")
                    .append(key)
                    .append(" = '")
                    .append(context.getWheres().get(key))
                    .append("'");
        }
        System.out.println("Select SQL : " + select.toString());
        return select.toString();
    }
}
