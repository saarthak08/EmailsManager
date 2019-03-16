package com.saarthak.android.contactmanager.Threads;

import android.os.AsyncTask;

import com.saarthak.android.contactmanager.MainActivity;
import com.saarthak.android.contactmanager.db.entity.Contact;

public class AddContactService extends AsyncTask<Contact,Void,Void> {
    @Override
    protected Void doInBackground(Contact... contacts) {
        long id = MainActivity.contactsAppDatabase.getContactDAO().addContact(contacts[0]);
        Contact contact = MainActivity.contactsAppDatabase.getContactDAO().getContact(id);

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
