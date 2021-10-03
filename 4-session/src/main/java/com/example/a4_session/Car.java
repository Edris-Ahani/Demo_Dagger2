package com.example.a4_session;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    //dagger first inject constructor
    //dagger second inject field
    //dagger third inject method
    private static final String TAG = "MyLog";


    @Inject
    Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        Log.d(TAG, "Car: Constructor");
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive(){
        Log.d(TAG, "drive: running...");
    }
}
