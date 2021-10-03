package com.example.a6_session;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "MyLog";

    private int horsePower;


    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "start: DieselEngine " + horsePower);
    }
}
