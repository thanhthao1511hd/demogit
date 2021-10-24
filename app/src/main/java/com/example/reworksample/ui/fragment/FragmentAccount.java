package com.example.reworksample.ui.fragment;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.reworksample.R;
import com.example.reworksample.databinding.FragmentAccountBinding;

public class FragmentAccount extends Fragment {

    FragmentAccountBinding binding;

    public FragmentAccount() {
        // Required empty public constructor
    }

    public static FragmentAccount newInstance() {

        Bundle args = new Bundle();

        FragmentAccount fragment = new FragmentAccount();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_account, container, false);
        return binding.getRoot();
    }
}