package com.saarthak.android.contactmanager.di;


import com.saarthak.android.contactmanager.MainActivity;
import com.saarthak.android.contactmanager.Threads.AddContactService;
import com.saarthak.android.contactmanager.Threads.DeleteContactService;
import com.saarthak.android.contactmanager.Threads.UpdateContactsService;
import com.saarthak.android.contactmanager.Threads.getAllContactsService;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class,DatabaseModule.class})
public interface ApplicationComponent {

    void inject(MainActivity mainActivity);
    void inject(AddContactService addContactService);
    void inject(DeleteContactService deleteContactService);
    void inject(getAllContactsService getAllContactsService);
    void inject(UpdateContactsService updateContactsService);
}
