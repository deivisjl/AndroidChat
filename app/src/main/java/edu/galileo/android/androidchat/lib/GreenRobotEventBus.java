package edu.galileo.android.androidchat.lib;

/**
 * Created by Usuario_Privado on 03/08/2016.
 */
public class GreenRobotEventBus implements EventBus {
    org.greenrobot.eventbus.EventBus eventBus;

    public GreenRobotEventBus() {
        this.eventBus =  org.greenrobot.eventbus.EventBus.getDefault();
    }

    private static class SingletonHolder{
        private static final GreenRobotEventBus INSTANCE = new GreenRobotEventBus();
    }
    public static GreenRobotEventBus getInstace(){
        return SingletonHolder.INSTANCE;
    }
    @Override
    public void register(Object subscriber) {
        eventBus.register(subscriber);
    }

    @Override
    public void unregister(Object subscriber) {
        eventBus.unregister(subscriber);
    }

    @Override
    public void post(Object event) {
        eventBus.post(event);
    }
}
