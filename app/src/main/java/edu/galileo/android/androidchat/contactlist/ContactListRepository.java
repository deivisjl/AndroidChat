package edu.galileo.android.androidchat.contactlist;

/**
 * Created by Usuario_Privado on 04/08/2016.
 */
public interface ContactListRepository {
    void signOff();
    String getCurrentUserEmail();
    void removerContact(String email);
    void destroyListener();
    void subscribeToContactLIstEvents();
    void unsubsuscribeToContactListEvents();
    void changeConnectionStatus(boolean online);
}
