package com.afc.mc_core;

import com.afc.core.base.BaseViewModel;
import com.afc.core.base.BaseViewState;
import com.afc.core.base.SingleLiveEvent;


public class TestActivityViewModel extends BaseViewModel<BaseViewState> {

    public SingleLiveEvent<String> testString = new SingleLiveEvent<>();

    public TestActivityViewModel() {

    }

    public void callTestString() {
        testString.call();
    }

}
