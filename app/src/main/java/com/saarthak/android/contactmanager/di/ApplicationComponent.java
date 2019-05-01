package com.saarthak.android.contactmanager.di;


import com.saarthak.android.contactmanager.MainActivity;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class,DatabaseModule.class})
public interface ApplicationComponent {

    void inject(MainActivity mainActivity);
}
