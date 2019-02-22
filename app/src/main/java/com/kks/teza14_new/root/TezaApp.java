package com.kks.teza14_new.root;

import android.app.Application;

import com.kks.teza14_new.custom_control.AndroidCommonSetup;

public class TezaApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AndroidCommonSetup.getInstance().init(this);

    }
}
