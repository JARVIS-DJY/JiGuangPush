package com.example.jarvis.jiguangpush;

import android.app.Application;

import java.util.Set;

import cn.jpush.android.api.JPushInterface;
import cn.jpush.android.api.TagAliasCallback;

/**
 * Created by jarvis on 2017/7/9.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);

        //设置别名
        JPushInterface.setAlias(this, "xiaoruo", new TagAliasCallback() {
            @Override
            public void gotResult(int i, String s, Set<String> set) {

            }
        });
    }
}
