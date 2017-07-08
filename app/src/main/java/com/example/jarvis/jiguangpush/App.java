package com.example.jarvis.jiguangpush;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by jarvis on 2017/7/9.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);

    }
}
