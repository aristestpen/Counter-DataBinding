package com.aries.courtcounter.fragment;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aries.courtcounter.R;
import com.aries.courtcounter.databinding.FragmentCounterBinding;
import com.aries.courtcounter.model.Score;


public class CounterFragment extends Fragment {

    private Score score;

    public CounterFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentCounterBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_counter, container, false);
        score = new Score(0, 0);
        binding.setScore(score);

        //Home

        binding.btnThreePointHome.setOnClickListener(v -> {
            score.setHomeScore(score.getHomeScore() + 3);
            binding.txtHomeScore.setText(Integer.toString(score.getHomeScore()));
        });

        binding.btnTwoPointHome.setOnClickListener(v -> {
            score.setHomeScore(score.getHomeScore() + 2);
            binding.txtHomeScore.setText(Integer.toString(score.getHomeScore()));
        });

        binding.btnFreeThrowHome.setOnClickListener(v -> {
            score.setHomeScore(score.getHomeScore() + 1);
            binding.txtHomeScore.setText(Integer.toString(score.getHomeScore()));
        });


        //Away
        binding.btnThreePointAway.setOnClickListener(v -> {
            score.setAwayScore(score.getAwayScore() + 3);
            binding.txtScoreAway.setText(Integer.toString(score.getAwayScore()));
        });

        binding.btnTwoPointAway.setOnClickListener(v -> {
            score.setAwayScore(score.getAwayScore() + 2);
            binding.txtScoreAway.setText(Integer.toString(score.getAwayScore()));
        });

        binding.btnFreeThrowAway.setOnClickListener(v -> {
            score.setAwayScore(score.getAwayScore() + 1);
            binding.txtScoreAway.setText(Integer.toString(score.getAwayScore()));
        });

        //Reset Score
        binding.btnResetScore.setOnClickListener(v -> {
            score.setHomeScore(0);
            score.setAwayScore(0);
            binding.txtHomeScore.setText(Integer.toString(score.getHomeScore()));
            binding.txtScoreAway.setText(Integer.toString(score.getAwayScore()));
        });
        return binding.getRoot();
    }
}