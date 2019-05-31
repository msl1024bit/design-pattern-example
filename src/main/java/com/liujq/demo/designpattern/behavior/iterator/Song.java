package com.liujq.demo.designpattern.behavior.iterator;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 歌曲类
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
@Data
@AllArgsConstructor
public class Song {

    /**
     * 歌曲名字
     */
    private String name;

    /**
     * 歌手
     */
    private String singer;

    public String getSongInfo() {
        return this.name + "--" + this.singer;
    }
}
