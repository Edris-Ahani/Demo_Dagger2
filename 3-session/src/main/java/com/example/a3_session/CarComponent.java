package com.example.a3_session;

import dagger.Component;

@Component
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
