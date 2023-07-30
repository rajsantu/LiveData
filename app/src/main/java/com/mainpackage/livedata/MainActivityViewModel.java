package com.mainpackage.livedata;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private final MutableLiveData<Integer> countLiveData = new MutableLiveData<>();
    private int counter = 40;

    // When the app first launched
    public MutableLiveData<Integer> getInitialCounter() {
        countLiveData.setValue(counter);
        return countLiveData;
    }


    // When user clicks the button
    public void getCounter() {
        counter++;
        countLiveData.setValue(counter);
    }


}
