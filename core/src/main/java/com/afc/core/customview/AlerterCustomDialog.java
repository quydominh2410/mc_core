package com.afc.core.customview;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;

import com.afc.core.R;
import com.bumptech.glide.Glide;

import com.tapadoo.alerter.Alerter;
import com.tapadoo.alerter.OnHideAlertListener;
import com.tapadoo.alerter.OnShowAlertListener;

public class AlerterCustomDialog {
    private Activity activity;
    private Alerter alerter;
    private LinearLayout lnBackground;
    private ImageView imgIcon;
    private TextView tvNoti, tvOk, tvCancel, tvOther;


    public static AlerterCustomDialog create(Activity activity){
        AlerterCustomDialog alert = new AlerterCustomDialog();
        alert.activity = activity;
        alert.alerter = Alerter.create(activity, R.layout.dialog_alerter_custom);
        alert.alerter.enableSwipeToDismiss();
        alert.alerter.setBackgroundColorRes(R.color.transparent);
        assert alert.alerter.getLayoutContainer() != null;
        alert.lnBackground = alert.alerter.getLayoutContainer().findViewById(R.id.ln_background);
        alert.imgIcon = alert.alerter.getLayoutContainer().findViewById(R.id.img_icon);
        alert.tvNoti = alert.alerter.getLayoutContainer().findViewById(R.id.tv_noti);
        alert.tvOk = alert.alerter.getLayoutContainer().findViewById(R.id.tv_ok);
        alert.tvCancel = alert.alerter.getLayoutContainer().findViewById(R.id.tv_cancel);
        alert.tvOther = alert.alerter.getLayoutContainer().findViewById(R.id.tv_other);
        return alert;
    }

    public static boolean isShowing() {
        return Alerter.isShowing();
    }

    public Alerter builder() {
        return alerter;
    }
    public AlerterCustomDialog setOnShowListener(OnShowAlertListener listener){
        alerter.setOnShowListener(listener);
        return this;
    }
    public AlerterCustomDialog setOnHideListener(OnHideAlertListener listener){
        alerter.setOnHideListener(listener);
        return this;
    }
    public AlerterCustomDialog setDrawableBackgroundAlert(@DrawableRes int drawable) {
        lnBackground.setBackground(ContextCompat.getDrawable(activity, drawable));
        return this;
    }
    public AlerterCustomDialog setDuration(int durtion) {
        alerter.setDuration(durtion);
        return this;
    }
    public AlerterCustomDialog setButtonOK(String text, View.OnClickListener onClickListener) {
        tvOk.setVisibility(View.VISIBLE);
        tvOk.setText(text);
        tvOk.setOnClickListener(onClickListener);
        return this;
    }

    public AlerterCustomDialog setButtonCancel(String text, View.OnClickListener onClickListener) {
        tvCancel.setVisibility(View.VISIBLE);
        tvCancel.setText(text);
        tvCancel.setOnClickListener(onClickListener);
        return this;
    }

    public AlerterCustomDialog setButtonOther(String text, View.OnClickListener onClickListener) {
        tvOther.setVisibility(View.VISIBLE);
        tvOther.setText(text);
        tvOther.setOnClickListener(onClickListener);
        return this;
    }

    public AlerterCustomDialog setIcon(@DrawableRes int drawable) {
        Glide.with(activity).load(drawable).into(imgIcon);
        return this;
    }

    public AlerterCustomDialog setContent(String content) {
        tvNoti.setText(content);
        return this;
    }


    public void show() {
        alerter.show();
    }

}

