package com.liujq.demo.designpattern.behavior.interpreter;

/**
 * UPDATE SQL解释器
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class UpdateSQLExpression extends SQLExpression {
    @Override
    public String interpret(Context context) {
        StringBuilder update = new StringBuilder();
        update.append("update ")
                .append(context.getTableName())
                .append(" set ");

        StringBuilder values = new StringBuilder();
        for (String key : context.getParams().keySet()) {
            values.append(key)
                    .append(" = '")
                    .append(context.getParams().get(key))
                    .append("',");
        }

        StringBuilder wheres = new StringBuilder();
        wheres.append(" 1 = 1 ");
        for (String key : context.getWheres().keySet()) {
            wheres.append(" and ")
                    .append(key)
                    .append(" = '")
                    .append(context.getWheres().get(key))
                    .append("'");
        }

        update.append(values.subSequence(0, values.length() - 1))
                .append(" where ")
                .append(wheres);
        System.out.println("Update SQL: " + update.toString());
        return update.toString();
    }
}
