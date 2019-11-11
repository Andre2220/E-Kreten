package com.TheShadowBrokers.e_kreten.ui.timetable;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TimetableViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TimetableViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Ez az órarend oldal");
    }

    public LiveData<String> getText() {
        return mText;
    }
}