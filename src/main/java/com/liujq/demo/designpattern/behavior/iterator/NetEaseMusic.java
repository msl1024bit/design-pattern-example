package com.liujq.demo.designpattern.behavior.iterator;

/**
 * 网易云音乐
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public class NetEaseMusic {

    private SongList songList;

    public NetEaseMusic() {
        songList = new SongList(3);
        songList.add(new Song("让我留在你身边", "陈奕迅"));
        songList.add(new Song("你曾是少年", "SHE"));
        songList.add(new Song("Perfect", "Ed Sheeran"));
    }

    /**
     * 循环听歌
     */
    public void listenByLoop() {
        Iterator iterator = songList.iterator();
        while (iterator.hasNext()) {
            System.out.println("列表循环听歌: " + ((Song)iterator.next()).getSongInfo());
        }
    }
}
