package com.example.a7_session;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {

    //if all of methods was static we have to create class abstract

    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels providesWheels(Rims rims, Tires tires){
        return new Wheels(rims, tires);
    }

}
