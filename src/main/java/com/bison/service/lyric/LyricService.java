package com.bison.service.lyric;

/**
 * Created by bm091125 on 6/28/2016.
 */
public class LyricService {
    private final long id;
    private final String content;

    public LyricService(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
