package edu.galileo.android.androidchat.login.ui.adapters;

import edu.galileo.android.androidchat.entities.User;

/**
 * Created by Usuario_Privado on 05/08/2016.
 */
public interface OnItemClickListener {
    void onItemClick(User user);
    void onItemLongClick(User user);
}
