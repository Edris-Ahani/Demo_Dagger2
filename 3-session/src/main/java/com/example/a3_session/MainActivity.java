package com.example.a3_session;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    //field injection
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();
        carComponent.inject(this);
        car.drive();
    }
}