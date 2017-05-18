package edu.galileo.android.androidchat.chat.entities;

import edu.galileo.android.androidchat.chat.events.ChatEvent;

/**
 * Created by Usuario_Privado on 08/08/2016.
 */
public interface ChatPresenter {
    void onPause();
    void onResume();
    void onCreate();
    void onDestroy();

    void setChatRecipient(String recipient);
    void sendMessage(String msg);
    void onEventMainThread(ChatEvent event);
}
