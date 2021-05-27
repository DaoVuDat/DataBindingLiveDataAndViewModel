package com.example.databindinglivedataviewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private final MutableLiveData<Integer> total = new MutableLiveData<>();


    public MutableLiveData<String> inputText = new MutableLiveData<>();

    MainActivityViewModel(Integer startingTotal) {
        this.total.setValue(startingTotal);
    }

    public LiveData<Integer> getTotal() {
        return total;
    }

    public void setTotal() {
        Integer input = Integer.valueOf(inputText.getValue());
        total.setValue(total.getValue() + input);
    }

}
