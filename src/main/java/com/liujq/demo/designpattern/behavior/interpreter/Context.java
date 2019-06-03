package com.liujq.demo.designpattern.behavior.interpreter;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 上下文类，这个类用于给解释器传递参数
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
@Data
public class Context {

    /**
     * 表名
     */
    private String tableName;

    /**
     * 修改时更新后的数据
     */
    private Map<String, Object> params = new HashMap<>();

    /**
     * where语句后面的条件
     */
    private Map<String, Object> wheres = new HashMap<>();
}
