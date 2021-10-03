package com.example.a2_session;

import android.app.Activity;
import android.content.Context;

import dagger.Component;

@Component
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
