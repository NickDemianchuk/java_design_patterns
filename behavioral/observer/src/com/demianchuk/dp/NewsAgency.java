package com.demianchuk.dp;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private String news;
    private List<Channel> observers;

    public NewsAgency() {
        this.observers = new ArrayList<>();
    }

    public void registerObserver(Channel channel){
        observers.add(channel);
    }

    public void unregisterObserver(Channel channel){
        observers.remove(channel);
    }

    public void setNews(String news){
        this.news = news;
        observers.stream()
                .forEach(o -> o.update(news));
    }
}
