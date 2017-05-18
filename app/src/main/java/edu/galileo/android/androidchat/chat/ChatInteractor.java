package edu.galileo.android.androidchat.chat;

/**
 * Created by Usuario_Privado on 08/08/2016.
 */
public interface ChatInteractor {
    void sendMessage(String msg);
    void setChatRecipient(String recipient);

    void subscribe();
    void unsubscribe();
    void destroyListener();
}
