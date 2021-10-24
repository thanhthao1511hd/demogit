package com.example.reworksample.ui.fragment;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.reworksample.R;
import com.example.reworksample.databinding.FragmentDetailBinding;

public class FragmentDetail extends Fragment {
    FragmentDetailBinding binding;
    public FragmentDetail() {
        // Required empty public constructor
    }

    public static FragmentDetail newInstance() {

        Bundle args = new Bundle();

        FragmentDetail fragment = new FragmentDetail();
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
        binding= DataBindingUtil.inflate(inflater, R.layout.fragment_detail, container, false);
        return binding.getRoot();
    }
}