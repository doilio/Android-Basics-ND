package com.doiliomatsinhe.scorekeeper;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private MutableLiveData<Integer> _teamAscore = new MutableLiveData<>();
    public LiveData<Integer> teamAscore = _teamAscore;
    private MutableLiveData<Integer> _teamBscore = new MutableLiveData<>();
    public LiveData<Integer> teamBscore = _teamBscore;

    public MainViewModel() {
        super();
        _teamAscore.setValue(0);
        _teamBscore.setValue(0);
    }

    public void incrementValueA(int score) {

        if (_teamAscore.getValue() != null) {
            _teamAscore.setValue(_teamAscore.getValue() + score);
        }
    }

    public void incrementValueB(int score) {
        if (_teamBscore.getValue() != null) {
            _teamBscore.setValue(_teamBscore.getValue() + score);
        }
    }

    public void resetScore() {
        _teamAscore.setValue(0);
        _teamBscore.setValue(0);
    }

}
