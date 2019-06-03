package com.liujq.demo.designpattern.behavior.interpreter;

/**
 * INSERT SQL解释器
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class InsertSQLExpression extends SQLExpression {
    @Override
    public String interpret(Context context) {
        StringBuilder insert = new StringBuilder();
        insert.append("insert into ")
                .append(context.getTableName());

        StringBuilder keys = new StringBuilder();
        StringBuilder values = new StringBuilder();
        keys.append(" (");
        values.append(" (");

        for (String key : context.getParams().keySet()) {
            keys.append(key).append(",");
            values.append("'").append(context.getParams().get(key)).append("',");
        }
        keys.replace(keys.length() - 1, keys.length(), ")");
        values.replace(values.length() - 1, values.length(), ")");

        insert.append(keys)
                .append(" values ")
                .append(values);

        System.out.println("Insert SQL:" + insert.toString());
        return insert.toString();
    }
}
