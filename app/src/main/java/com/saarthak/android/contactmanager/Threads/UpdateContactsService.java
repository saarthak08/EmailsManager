package com.saarthak.android.contactmanager.Threads;

import android.os.AsyncTask;

import com.saarthak.android.contactmanager.MainActivity;
import com.saarthak.android.contactmanager.db.entity.Contact;

public class UpdateContactsService extends AsyncTask<Contact,Void,Void> {
    @Override
    protected Void doInBackground(Contact... contacts) {
        MainActivity.contactsAppDatabase.getContactDAO().updateContact(contacts[0]);
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        MainActivity.contactsAdapter.notifyDataSetChanged();
        super.onPostExecute(aVoid);
    }
}
