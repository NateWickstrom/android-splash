package com.example.splash;

import android.app.Application;


public class App extends Application {

    private static final int REALLY_BIG_NUMBER = 1000000000;

    @Override
    public void onCreate() {
        super.onCreate();

        int i = 0;
        while(i++ < REALLY_BIG_NUMBER);
    }
}
