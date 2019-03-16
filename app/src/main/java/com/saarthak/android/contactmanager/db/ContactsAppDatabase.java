package com.saarthak.android.contactmanager.db;


import com.saarthak.android.contactmanager.db.entity.Contact;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Contact.class}, version =1,exportSchema = false)
public abstract class ContactsAppDatabase extends RoomDatabase {
    public abstract ContactsDAO getContactDAO();
}
