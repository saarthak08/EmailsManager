package com.saarthak.android.contactmanager.di;

import android.app.Application;
import android.content.Context;

import androidx.room.Room;

import com.saarthak.android.contactmanager.db.ContactsAppDatabase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Singleton
@Module
public class DatabaseModule {

    @Provides
    ContactsAppDatabase providesDatabase(Context context)
    {
        return Room.databaseBuilder(context, ContactsAppDatabase.class, "ContactsDB").build();
    }
}
