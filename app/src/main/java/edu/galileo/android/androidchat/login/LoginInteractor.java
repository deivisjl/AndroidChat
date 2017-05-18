package edu.galileo.android.androidchat.login;

/**
 * Created by Usuario_Privado on 02/08/2016.
 */
public interface LoginInteractor {
    void checkSession();
    void doSignUp(String email, String password);
    void doSignIn(String email, String password);
}
