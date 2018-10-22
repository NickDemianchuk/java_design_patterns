package com.demianchuk.dp;

public class ObserverDemo {
    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("Something is happening");
        System.out.println(observer.getNews());
    }
}
