package edu.galileo.android.androidchat.chat;

import edu.galileo.android.androidchat.chat.entities.ChatMessage;

/**
 * Created by Usuario_Privado on 08/08/2016.
 */
public interface ChatView {
    void onMessageReceived(ChatMessage msg);
}
