package com.afc.core.utils;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.TranslateAnimation;

public class AnimationUtils {

    public static void slideUpBottom(View view) {
        view.setVisibility(View.VISIBLE);
        TranslateAnimation animate = new TranslateAnimation(
                0,                 // fromXDelta
                0,                 // toXDelta
                view.getHeight(),  // fromYDelta
                0);                // toYDelta
        animate.setDuration(400);
//        animate.setFillAfter(true);
        view.startAnimation(animate);
    }

    // slide the view from its current position to below itself
    public static void slideDownBottom(View view) {
        TranslateAnimation animate = new TranslateAnimation(
                0,                 // fromXDelta
                0,                 // toXDelta
                0,                 // fromYDelta
                view.getHeight()); // toYDelta
        animate.setDuration(400);
//        animate.setFillAfter(true);
        view.startAnimation(animate);
        view.setVisibility(View.GONE);
    }

    public static void slideUpTop(View view) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "translationY", -view.getHeight());
        animator.setDuration(400);
        animator.start();
    }

    // slide the view from its current position to below itself
    public static void slideDownTop(View view) {

        view.setVisibility(View.VISIBLE);
        view.setTranslationY(-view.getHeight());
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "translationY", 0);
        animator.setDuration(400);
        animator.start();
    }

}
