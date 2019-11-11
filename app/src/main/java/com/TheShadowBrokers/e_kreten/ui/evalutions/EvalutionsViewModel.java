package com.TheShadowBrokers.e_kreten.ui.evalutions;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EvalutionsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EvalutionsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Ez a jegyek oldal");
    }

    public LiveData<String> getText() {
        return mText;
    }
}