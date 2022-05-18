package com.afc.mc_core;

import android.util.Log;
import android.widget.Toast;

import com.afc.core.base.BaseActivity;
import com.afc.mc_core.databinding.ActivityTestBinding;

public class TestActivity extends BaseActivity<ActivityTestBinding, TestActivityViewModel> {


    @Override
    protected void initView() {
        Log.d("qq_", "initView");
        viewModel.testString.setValue("QQ");

    }

    @Override
    protected void initControl() {
        Log.d("qq_", "initControl");
        viewModel.testString.observe(this, s -> {
            Toast.makeText(this,s, Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    protected void initViewModel() {
        Log.d("qq_", "initViewModel");

    }

    @Override
    public int getLayout() {
        return R.layout.activity_test;
    }

    @Override
    protected Class<TestActivityViewModel> getNameClass() {
        return TestActivityViewModel.class;
    }
}