package com.aries.courtcounter.fragment;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aries.courtcounter.R;
import com.aries.courtcounter.databinding.FragmentCounterBinding;
import com.aries.courtcounter.model.Score;
import com.aries.courtcounter.viewModel.CounterViewModel;


public class CounterFragment extends Fragment {

    private CounterViewModel viewModel;

    public CounterFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentCounterBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_counter, container, false);
        viewModel = new ViewModelProvider(this).get(CounterViewModel.class);
        binding.setLifecycleOwner(this);
        binding.setCounterViewModel(viewModel);
        return binding.getRoot();

    }
}