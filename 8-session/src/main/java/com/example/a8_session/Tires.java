package com.example.a8_session;

import android.util.Log;

public class Tires {
    //we don't own this class so we can't annotate it with @Inject

    private static final String TAG = "MyLog";

    public void inflate(){
        Log.d(TAG, "inflate: ");
    }
}
