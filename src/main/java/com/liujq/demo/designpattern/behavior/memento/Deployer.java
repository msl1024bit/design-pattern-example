package com.liujq.demo.designpattern.behavior.memento;

import lombok.Data;

/**
 * 部署应用的同学
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
@Data
public class Deployer {
    private App app;

    /**
     * 创建app备份
     *
     * @return
     */
    public AppBackup createAppBackup() {
        return new AppBackup(app);
    }

    /**
     * 恢复备份
     *
     * @param appBackup
     */
    public void setAppBackup(AppBackup appBackup) {
        this.app = appBackup.getApp();
    }

    /**
     * 显示应用信息
     */
    public void showApp() {
        System.out.println(this.app.toString());
    }

    /**
     * 暂停应用
     */
    public void stopApp() {
        System.out.println("暂停应用：" + this.app.toString());
    }

    /**
     * 启动应用
     */
    public void startApp() {
        System.out.println("启动应用：" + this.app.toString());
    }
}
