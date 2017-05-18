package edu.galileo.android.androidchat.chat;

/**
 * Created by Usuario_Privado on 08/08/2016.
 */
public interface ChatRepository {
    void sendMessage(String msg);
    void setRecipient(String recipient);

    void subscribe();
    void unsubscribe();
    void destroyListener();
    void changeConnectionStatus(boolean online);
}
