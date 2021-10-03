package com.example.a5_session;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "MyLog";

    @Inject
    public DieselEngine() {
    }

    @Override
    public void start() {
        Log.d(TAG, "start: DieselEngine");
    }
}
