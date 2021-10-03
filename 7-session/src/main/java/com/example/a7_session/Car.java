package com.example.a7_session;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    //dagger first inject constructor
    //dagger second inject field
    //dagger third inject method
    private static final String TAG = "MyLog";

    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        Log.d(TAG, "Car: Constructor");
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive(){
        engine.start();
        Log.d(TAG, "drive: running...");
    }
}
