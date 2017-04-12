package com.cj.library.app;

import android.app.Application;
import android.content.Context;

/**
 * Created by cj on 2017/4/12.
 */

public class BaseApplication extends Application {

    private static BaseApplication baseApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        baseApplication=this;
    }

    public static Context getContext(){
        return baseApplication;
    }
}
