package com.saarthak.android.contactmanager.Threads;

import android.os.AsyncTask;

import com.saarthak.android.contactmanager.MainActivity;
import com.saarthak.android.contactmanager.db.entity.Contact;

public class DeleteContactService extends AsyncTask<Contact,Void,Void> {
    @Override
    protected Void doInBackground(Contact... contacts) {
        MainActivity.contactsAppDatabase.getContactDAO().deleteContact(contacts[0]);
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        MainActivity.contactsAdapter.notifyDataSetChanged();
    }
}
