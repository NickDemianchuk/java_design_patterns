package com.demianchuk.dp;

public class MySingleton {
    // static initialization (on load)
//    private static MySingleton instance = new MySingleton();

    // lazy initialization (on request)
    private static MySingleton instance;

    // private constructor disables client to do new MySingleton()
    private MySingleton(){}
    // global access point
    public static MySingleton getInstance(){
        if(instance == null)
            instance = new MySingleton();
        return instance;
    }
    // some logic
    public void doSomething(){
        System.out.println("Do something");
    }
}
