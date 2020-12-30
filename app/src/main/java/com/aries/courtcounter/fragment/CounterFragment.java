package com.aries.courtcounter.fragment;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aries.courtcounter.R;
import com.aries.courtcounter.databinding.FragmentCounterBinding;
import com.aries.courtcounter.model.Score;
import com.aries.courtcounter.viewModel.CounterViewModel;


public class CounterFragment extends Fragment {

    private Score score;
    private CounterViewModel viewModel;

    public CounterFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentCounterBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_counter, container, false);
        viewModel = new ViewModelProvider(this).get(CounterViewModel.class);
        binding.setCounterViewModel(viewModel);

        //Home

        binding.btnThreePointHome.setOnClickListener(v -> {
            viewModel.score.setHomeScore(viewModel.score.getHomeScore() + 3);
            binding.txtHomeScore.setText(Integer.toString(viewModel.score.getHomeScore()));
        });

        binding.btnTwoPointHome.setOnClickListener(v -> {
            viewModel.score.setHomeScore(viewModel.score.getHomeScore() + 2);
            binding.txtHomeScore.setText(Integer.toString(viewModel.score.getHomeScore()));
        });

        binding.btnFreeThrowHome.setOnClickListener(v -> {
            viewModel.score.setHomeScore(viewModel.score.getHomeScore() + 1);
            binding.txtHomeScore.setText(Integer.toString(viewModel.score.getHomeScore()));
        });


        //Away
        binding.btnThreePointAway.setOnClickListener(v -> {
            viewModel.score.setAwayScore(viewModel.score.getAwayScore() + 3);
            binding.txtScoreAway.setText(Integer.toString(viewModel.score.getAwayScore()));
        });

        binding.btnTwoPointAway.setOnClickListener(v -> {
            viewModel.score.setAwayScore(viewModel.score.getAwayScore() + 2);
            binding.txtScoreAway.setText(Integer.toString(viewModel.score.getAwayScore()));
        });

        binding.btnFreeThrowAway.setOnClickListener(v -> {
            viewModel.score.setAwayScore(viewModel.score.getAwayScore() + 1);
            binding.txtScoreAway.setText(Integer.toString(viewModel.score.getAwayScore()));
        });

        //Reset Score
        binding.btnResetScore.setOnClickListener(v -> {
            viewModel.score.setHomeScore(0);
            viewModel.score.setAwayScore(0);
            binding.txtHomeScore.setText(Integer.toString(viewModel.score.getHomeScore()));
            binding.txtScoreAway.setText(Integer.toString(viewModel.score.getAwayScore()));
        });
        return binding.getRoot();
    }
}