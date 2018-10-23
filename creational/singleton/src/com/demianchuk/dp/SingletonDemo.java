package com.demianchuk.dp;

public class SingletonDemo {
    public static void main(String[] args) {
        // illegal construct
//        MySingleton singleton = new MySingleton();

        // get the only instance available
        MySingleton singleton = MySingleton.getInstance();

        // do something
        singleton.doSomething();
    }
}
