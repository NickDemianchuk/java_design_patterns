package com.demianchuk.dp;

public class NewsChannel implements Channel {
    private String news;

    public String getNews() {
        return news;
    }

    @Override
    public void update(Object o) {
        this.news = (String) o;
    }
}
