package edu.galileo.android.androidchat.contactlist;

/**
 * Created by Usuario_Privado on 04/08/2016.
 */
public interface ContactListSessionInteractor {
    void signOff();
    String getCurrentUserEmail();
    void changeConnectionStatus(boolean online);
}
