package com.example.a5_session;

import dagger.Component;

@Component(modules = {WheelsModule.class, /*PetrolEngineModule.class,*/ DieselEngineModule.class})
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
