package com.example.a6_session;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = "MyLog";

    @Inject
    public PetrolEngine() {
    }

    @Override
    public void start() {
        Log.d(TAG, "start: PetrolEngine");
    }
}
