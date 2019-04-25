package com.saarthak.android.contactmanager.Threads;

import android.os.AsyncTask;

import com.saarthak.android.contactmanager.MainActivity;
import com.saarthak.android.contactmanager.db.ContactsAppDatabase;
import com.saarthak.android.contactmanager.db.entity.Contact;
import com.saarthak.android.contactmanager.di.App;

import javax.inject.Inject;

public class AddContactService extends AsyncTask<Contact,Void,Void> {
    @Inject
    ContactsAppDatabase contactsAppDatabase;

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        App.getApp().getApplicationComponent().inject(this);
    }

    @Override
    protected Void doInBackground(Contact... contacts) {

        long id = contactsAppDatabase.getContactDAO().addContact(contacts[0]);
        Contact contact =contactsAppDatabase.getContactDAO().getContact(id);

        if (contact != null) {
            MainActivity.contactArrayList.add(0, contact);
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        MainActivity.contactsAdapter.notifyDataSetChanged();
    }
}
