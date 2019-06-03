package com.liujq.demo.designpattern.behavior.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 应用备份
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
@Data
@AllArgsConstructor
public class AppBackup {
    private App app;
}
