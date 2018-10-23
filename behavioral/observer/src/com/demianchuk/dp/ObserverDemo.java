package com.demianchuk.dp;

public class ObserverDemo {
    public static void main(String[] args) {
        // observable
        NewsAgency agency = new NewsAgency();
        // observer
        NewsChannel channel = new NewsChannel();
        // registering an observer
        agency.registerObserver(channel);
        // changing a state of the observable
        agency.setNews("Breaking news!");
        // all observers are notified automatically
        System.out.println(channel.getNews());
    }
}
