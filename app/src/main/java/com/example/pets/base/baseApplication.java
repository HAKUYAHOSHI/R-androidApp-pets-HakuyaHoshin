package com.example.pets.base;

import android.app.Application;
import android.content.Context;

public class baseApplication extends Application {

    private static Context appContext;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = getBaseContext();
    }

    public static Context getAppContext(){
        return appContext;
    }
}
