package com.vakatip;

/**
 * Created by pvakati on 2/7/2018.
 */
public class SingletonDemo {

    private static SingletonDemo _instance = null;

    SingletonDemo() {

    }

    public static SingletonDemo getInstance() {

        if (_instance == null) {

            _instance = new SingletonDemo();
        }
        return _instance;
    }

}
