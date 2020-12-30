package com.aries.courtcounter.viewModel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.aries.courtcounter.model.Score;

public class CounterViewModel extends ViewModel {

    public MutableLiveData<Score> scoreMutableLiveData = new MutableLiveData<>();
    public Score score = new Score(0, 0);

    public void addPointHome(int point){
        score.setHomeScore(score.getHomeScore()+point);
        scoreMutableLiveData.setValue(score);
        Log.d("Point Home",  String.valueOf(score.getHomeScore()));
    }

    public void addPointAway(int point){
        score.setAwayScore(score.getAwayScore()+point);
        scoreMutableLiveData.setValue(score);
        Log.d("Point Away",  String.valueOf(score.getAwayScore()));

    }
}

