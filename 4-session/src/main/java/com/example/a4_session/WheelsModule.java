package com.example.a4_session;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        //configure your tires object
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels providesWheels(Rims rims, Tires tires){
        return new Wheels(rims, tires);
    }

}
