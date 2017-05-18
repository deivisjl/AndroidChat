package edu.galileo.android.androidchat.events;

/**
 * Created by Usuario_Privado on 06/08/2016.
 */
public class AddContactEvent {
    boolean error = false;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
