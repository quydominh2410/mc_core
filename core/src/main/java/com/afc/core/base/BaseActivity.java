package com.afc.core.base;



import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.annotation.NavigationRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;


import com.afc.core.R;
import com.afc.core.analytics.AppAnalytics;
import com.afc.core.analytics.RemoteConfig;
import com.afc.core.customview.AlerterCustomDialog;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;



public abstract class BaseActivity<B extends ViewDataBinding, M extends BaseViewModel<? extends BaseViewState>> extends AppCompatActivity {

    protected final String TAG = this.getClass().getSimpleName();
    protected B binding;
    protected M viewModel;

    private Dialog dialog;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this, getDefaultViewModelProviderFactory()).get(getNameClass());
        binding = DataBindingUtil.setContentView(this, getLayout());
        binding.setLifecycleOwner(this);
        initViewModel();
        initView();
        initControl();

        viewModel.loadingIndicator.observe(this, aBoolean -> {
            if (aBoolean) showLoading();
            else hideLoading();
        });

        viewModel.errorApiEvent.observe(this, s -> Log.e(TAG, "errorApiEvent: $it"));

        viewModel.showDialogError.observe(this, e -> {
            if (!TextUtils.isEmpty(e.getMessage())) {
                showDialogError(e.getMessage());
            }
        });

        viewModel.showDialogSuccess.observe(this, s -> {
            if (!TextUtils.isEmpty(s)) {
                showAlertSuccess(s);
            }
        });


    }

    protected abstract void initView();

    protected abstract void initControl();

    protected abstract void initViewModel();

    @LayoutRes
    public abstract int getLayout();

    protected abstract Class<M> getNameClass();




    public void showLoading() {
        try {
            dialog = new Dialog(this, R.style.FullScreenDialog);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setContentView(R.layout.loading_view);
            dialog.setCancelable(false);
            dialog.show();
        } catch (Exception e) {
            AppAnalytics.logAppcenter("Utils", "Exception", e.getMessage());
        }
    }

    public void showLoadingCoin() {

    }


    protected void hideLoading() {
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    @Override
    public void onDestroy() {
        hideLoading();
        super.onDestroy();
    }

    private void showDialogError(String message) {
        try {
            AlerterCustomDialog.create(this)
                    .setContent(message)
                    .setDrawableBackgroundAlert(R.drawable.bg_alert_error)
                    .setIcon(R.drawable.ic_noti_error)
                    .setDuration((int) (RemoteConfig.getConfig().getDouble("notification_banner_error_duration") * 1000))
                    .show();
        } catch (Exception e) {
            AppAnalytics.logAppcenter("Utils", "Exception", e.getMessage());
        }
    }

    public void showAlertSuccess(String message) {
        try {
            AlerterCustomDialog.create(this)
                    .setContent(message)
                    .setDrawableBackgroundAlert(R.drawable.bg_alert_success)
                    .setIcon(R.drawable.ic_noti_checked)
                    .setDuration((int) (RemoteConfig.getConfig().getDouble("notification_banner_error_duration") * 1000))
                    .show();
        } catch (Exception e) {
            AppAnalytics.logAppcenter("Utils", "Exception", e.getMessage());
        }
    }

    public void showAlertError(String message) {
        try {
            AlerterCustomDialog.create(this)
                    .setContent(message)
                    .setDrawableBackgroundAlert(R.drawable.bg_alert_error)
                    .setIcon(R.drawable.ic_noti_error)
                    .setDuration((int) (RemoteConfig.getConfig().getDouble("notification_banner_error_duration") * 1000))
                    .show();
        } catch (Exception e) {
            AppAnalytics.logAppcenter("Utils", "Exception", e.getMessage());
        }
    }


}
