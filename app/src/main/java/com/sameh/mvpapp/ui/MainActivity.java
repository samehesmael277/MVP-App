package com.sameh.mvpapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.sameh.mvpapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements NumbersResultView {

    ActivityMainBinding binding;
    NumbersPresenter numbersPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        numbersPresenter = new NumbersPresenter(this);

        binding.plusButton.setOnClickListener(v -> numbersPresenter.getPlusResult());

        binding.divButton.setOnClickListener(v -> numbersPresenter.getDivResult());

        binding.mulButton.setOnClickListener(v -> numbersPresenter.getMultiResult());
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onGetPlusResult(int res) {
        binding.plusResultTextView.setText(res+"");
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onGetDivResult(int res) {
        binding.divResultTextView.setText(res+"");
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onGetMultiResult(int res) {
        binding.mulResultTextView.setText(res+"");
    }
}