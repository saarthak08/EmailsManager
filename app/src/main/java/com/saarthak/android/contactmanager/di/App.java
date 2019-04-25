package com.saarthak.android.contactmanager.di;

import android.app.Application;

public class App extends Application {
    private ApplicationComponent applicationComponent;
    private static App app;

    public static App getApp() {
        return app;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app=this;
        applicationComponent=DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(app)).build();

    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
