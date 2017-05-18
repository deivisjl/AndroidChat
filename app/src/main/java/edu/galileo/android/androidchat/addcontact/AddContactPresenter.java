package edu.galileo.android.androidchat.addcontact;

import edu.galileo.android.androidchat.events.AddContactEvent;

/**
 * Created by Usuario_Privado on 06/08/2016.
 */
public interface AddContactPresenter {
    void onShow();
    void onDestroy();

    void addContact(String email);
    void onEventMainThread(AddContactEvent event);
}
