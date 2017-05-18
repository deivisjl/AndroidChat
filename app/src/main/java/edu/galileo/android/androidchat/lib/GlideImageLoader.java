package edu.galileo.android.androidchat.lib;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.Glide;

/**
 * Created by Usuario_Privado on 05/08/2016.
 */
public class GlideImageLoader implements  ImageLoading {
    private RequestManager requestManager;

    public GlideImageLoader(Context context) {
        this.requestManager = Glide.with(context);
    }

    @Override
    public void load(ImageView imgAvatar, String url) {
        requestManager.load(url).into(imgAvatar);
    }
}
