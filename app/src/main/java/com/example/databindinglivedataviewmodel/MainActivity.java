package com.example.databindinglivedataviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.databindinglivedataviewmodel.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainActivityViewModel mainActivityViewModel;
    private MainActivityViewModelFactory mainActivityViewModelFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mainActivityViewModelFactory = new MainActivityViewModelFactory(125);
        mainActivityViewModel = new ViewModelProvider(this, mainActivityViewModelFactory).get(MainActivityViewModel.class);

        binding.setMyViewModel(mainActivityViewModel);

        // use this line instead of observe
        binding.setLifecycleOwner(this);

//        mainActivityViewModel.getTotal().observe(this, integer -> {
//            binding.resultTextView.setText(String.valueOf(integer));
//        });

    }
}