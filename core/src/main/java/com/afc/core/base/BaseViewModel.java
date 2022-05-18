package com.afc.core.base;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModel;

import com.google.gson.Gson;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;




public abstract class BaseViewModel<ST extends BaseViewState> extends ViewModel {
    protected String TAG = this.getClass().getSimpleName();
//    protected final CompositeDisposable disposable = new CompositeDisposable();
    protected final MediatorLiveData<ST> viewState = new MediatorLiveData<>();
    public final SingleLiveEvent<Object> clickBackEvent = new SingleLiveEvent<>();
    public final SingleLiveEvent<Object> clickNextEvent = new SingleLiveEvent<>();
    public SingleLiveEvent<Boolean> loadingIndicator = new SingleLiveEvent<>();
    public final SingleLiveEvent<Object> internetDisconnectEvent = new SingleLiveEvent<>();
    public final SingleLiveEvent<String> errorApiEvent = new SingleLiveEvent<>();
    public final SingleLiveEvent<Exception> showDialogError = new SingleLiveEvent<>();
    public final SingleLiveEvent<String> showDialogSuccess = new SingleLiveEvent<>();

    @Override
    protected void onCleared() {
        super.onCleared();
//        disposeAll();
        System.gc();
    }

//    private void disposeAll() {
//        disposable.clear();
//    }



    LiveData<ST> getViewState() {
        return viewState;
    }

    protected void renderViewWithState(ST newState) {
        viewState.setValue(newState);
    }

    public void onClickBackHandler() {
        clickBackEvent.call();
    }

    public void onClickNextHandler() {
        clickNextEvent.call();
    }

    public void showDialogError() {
        showDialogError.call();
    }

    public void showDialogSuccess() {
        showDialogSuccess.call();
    }
}
