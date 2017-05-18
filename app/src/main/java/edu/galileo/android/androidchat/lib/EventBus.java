package edu.galileo.android.androidchat.lib;

/**
 * Created by Usuario_Privado on 03/08/2016.
 */
public interface EventBus {
    void register(Object subscriber);
    void unregister(Object subscriber);
    void post(Object event);
}
