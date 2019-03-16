package com.saarthak.android.contactmanager.Threads;

import android.content.Context;
import android.os.AsyncTask;

import com.saarthak.android.contactmanager.MainActivity;
import com.saarthak.android.contactmanager.db.ContactsAppDatabase;

import androidx.room.Room;

public class getAllContactsService extends AsyncTask<Void, Void,Void> {
    @Override
    protected Void doInBackground(Void... voids) {
        MainActivity.contactArrayList.addAll(MainActivity.contactsAppDatabase.getContactDAO().getContacts());
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        MainActivity.contactsAdapter.notifyDataSetChanged();
    }
}
