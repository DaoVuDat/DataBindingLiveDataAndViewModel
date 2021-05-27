package com.example.databindinglivedataviewmodel;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

// Dung Factory de co the truyen tham so vao ViewModel
public class MainActivityViewModelFactory implements ViewModelProvider.Factory {
    private Integer startingTotal;
    public MainActivityViewModelFactory(Integer startingTotal) {
        this.startingTotal = startingTotal;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(MainActivityViewModel.class)) {
            return (T) new MainActivityViewModel(startingTotal);
        }

        throw new IllegalArgumentException("Unknown View Model Class");
    }
}
