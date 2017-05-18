package edu.galileo.android.androidchat.login;

/**
 * Created by Usuario_Privado on 02/08/2016.
 */
public interface LoginRepository {
    void signUp(String email, String password);
    void signIn(String email, String password);
    void checkSession();
}
