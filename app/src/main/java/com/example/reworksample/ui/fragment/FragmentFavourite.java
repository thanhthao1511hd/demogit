package com.example.reworksample.ui.fragment;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.reworksample.R;
import com.example.reworksample.databinding.FragmentFavouriteBinding;

public class FragmentFavourite extends Fragment {

    FragmentFavouriteBinding binding;

    public FragmentFavourite() {
        // Required empty public constructor
    }

    public static FragmentFavourite newInstance() {

        Bundle args = new Bundle();

        FragmentFavourite fragment = new FragmentFavourite();
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
        // Inflate the layout for this fragment
        binding= DataBindingUtil.inflate(inflater, R.layout.fragment_favourite, container, false);
        return binding.getRoot();
    }
}