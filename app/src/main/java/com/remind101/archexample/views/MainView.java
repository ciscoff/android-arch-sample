package com.remind101.archexample.views;

import com.arellomobile.mvp.MvpView;
import com.remind101.archexample.models.Counter;

import java.util.List;

public interface MainView extends MvpView {
    void showCounters(List<Counter> counters);

    void showLoading();

    void showEmpty();
}
