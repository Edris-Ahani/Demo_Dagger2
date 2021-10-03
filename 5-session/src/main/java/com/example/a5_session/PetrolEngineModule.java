package com.example.a5_session;

import javax.inject.Inject;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindPetrolEngine(PetrolEngine engine);
}
