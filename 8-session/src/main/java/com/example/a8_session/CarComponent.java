package com.example.a8_session;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class, /*DieselEngineModule.class*/})
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder horsePower(@Named("horsePower") int horsesPower);

        @BindsInstance
        Builder engineCapacity(@Named("engineCapacity") int engineCapacity);

        CarComponent build();
    }
}
