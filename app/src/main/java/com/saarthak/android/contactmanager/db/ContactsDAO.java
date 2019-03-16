package com.saarthak.android.contactmanager.db;

import com.saarthak.android.contactmanager.db.entity.Contact;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface ContactsDAO {

    @Insert
    public long addContact(Contact contact);

    @Update
    public long updateContact(Contact contact);

    @Delete
    public void deleteContact(Contact contact);

    @Query("select * from contacts" )
    public List<Contact> getContacts();

    @Query("select * from contacts where contact_id==:contactID")
    public Contact getContact(long contactID);

}