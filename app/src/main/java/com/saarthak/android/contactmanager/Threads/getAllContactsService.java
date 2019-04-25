package com.saarthak.android.contactmanager.Threads;

import android.content.Context;
import android.os.AsyncTask;

import com.saarthak.android.contactmanager.MainActivity;
import com.saarthak.android.contactmanager.db.ContactsAppDatabase;
import com.saarthak.android.contactmanager.di.App;

import androidx.room.Room;

import javax.inject.Inject;

public class getAllContactsService extends AsyncTask<Void, Void,Void> {
    @Inject
    ContactsAppDatabase contactsAppDatabase;

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        App.getApp().getApplicationComponent().inject(this);
    }

    @Override
    protected Void doInBackground(Void... voids) {
        MainActivity.contactArrayList.addAll(contactsAppDatabase.getContactDAO().getContacts());
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        MainActivity.contactsAdapter.notifyDataSetChanged();
    }
}
