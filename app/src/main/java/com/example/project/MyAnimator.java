package com.example.project;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.widget.Toolbar;


public class MyAnimator {

    public static void animation(Context context, ImageView mImageView, int delay) {
        Animation stb = AnimationUtils.loadAnimation(context, R.anim.stb);
        stb.setStartOffset(delay);
        mImageView.startAnimation(stb);
    }

    public static void animation(Context context, Toolbar toolbar, int delay) {
        Animation ttb = AnimationUtils.loadAnimation(context, R.anim.ttb);
        ttb.setStartOffset(delay);
        toolbar.startAnimation(ttb);
    }

    public static void animation(Context context, View view, int delay) {
        Animation stb = AnimationUtils.loadAnimation(context, R.anim.stb);
        stb.setStartOffset(delay);
        view.startAnimation(stb);
    }

}
