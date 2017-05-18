package edu.galileo.android.androidchat.addcontact.ui;

/**
 * Created by Usuario_Privado on 06/08/2016.
 */
public interface AddContactView {
    void showInput();
    void hideInput();
    void showProgress();
    void hideProgress();

    void contactAdded();
    void contactNotAdded();
}
