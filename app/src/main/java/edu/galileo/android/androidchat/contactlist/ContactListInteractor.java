package edu.galileo.android.androidchat.contactlist;

/**
 * Created by Usuario_Privado on 04/08/2016.
 */
public interface ContactListInteractor {
    void subscribe();
    void unsubscribe();
    void destroyListener();
    void removeContact(String email);
}
