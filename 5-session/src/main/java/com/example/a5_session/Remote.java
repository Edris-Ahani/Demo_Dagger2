package com.example.a5_session;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "MyLog";

    @Inject
    public Remote() {
    }

    public void setListener(Car car){
        Log.d(TAG, "setListener: Remote Connected");
    }
}
