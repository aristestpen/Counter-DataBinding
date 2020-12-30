package com.aries.courtcounter.viewModel;

import androidx.lifecycle.ViewModel;

import com.aries.courtcounter.model.Score;

public class CounterViewModel extends ViewModel {

    public Score score = new Score(0, 0);
}

