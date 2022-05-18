package com.afc.mc_core;

import androidx.lifecycle.LifecycleObserver;
import androidx.multidex.MultiDexApplication;


public class MyApplication extends MultiDexApplication implements LifecycleObserver {
    @Override
    public void onCreate() {
        super.onCreate();
    }


}
