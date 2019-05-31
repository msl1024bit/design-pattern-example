package com.liujq.demo.designpattern.behavior.iterator;

/**
 * 歌曲List集合
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public class SongList implements List {

    private Song[] songs;
    private int index;
    private int size;

    public SongList(int size) {
        this.index = 0;
        this.size = 0;
        songs = new Song[size];
    }

    @Override
    public Iterator iterator() {
        return new IteratorImpl(this);
    }

    @Override
    public void add(Object object) {
        songs[index++] = (Song) object;
        size++;
    }

    @Override
    public Object get(int index) {
        return songs[index];
    }

    @Override
    public int size() {
        return size;
    }
}
