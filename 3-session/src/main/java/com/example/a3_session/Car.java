package com.example.a3_session;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    //dagger first called constructor after that called filed and finally method
    private static final String TAG = "MyLog";

    @Inject//field injection
    Engine engine;
    private Wheels wheels;

    @Inject//constructor injection
    public Car(Wheels wheels) {
        Log.d(TAG, "Car: Constructor");
        this.wheels = wheels;
    }

    @Inject//method injection
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive(){
        Log.d(TAG, "drive: running...");
    }
}
