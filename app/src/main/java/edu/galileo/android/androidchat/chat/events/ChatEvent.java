package edu.galileo.android.androidchat.chat.events;

import edu.galileo.android.androidchat.chat.entities.ChatMessage;

/**
 * Created by Usuario_Privado on 08/08/2016.
 */
public class ChatEvent {
    ChatMessage msg;

    public ChatEvent(ChatMessage msg) {
        this.msg = msg;
    }

    public ChatMessage getMessage() {
        return msg;
    }
}
