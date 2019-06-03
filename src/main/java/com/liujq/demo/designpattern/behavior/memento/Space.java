package com.liujq.demo.designpattern.behavior.memento;

import lombok.Data;

/**
 * 备份所在的空间
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
@Data
public class Space {

    /**
     * 应用的备份
     */
    private AppBackup appBackup;
}
