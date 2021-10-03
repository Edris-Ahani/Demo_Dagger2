package com.example.demo_dagger2;

import android.util.Log;

import javax.inject.Inject;
//dependency injection is design pattern
//Car is depend on Engine and Wheels
public class Car {
    private static final String TAG = Car.class.getName();

    private Engine engine;  //Engine is dependency of Car
    private Wheels wheels;  //Wheels is dependency of Car

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive(){
        Log.d(TAG, "drive: ");
    }
}
