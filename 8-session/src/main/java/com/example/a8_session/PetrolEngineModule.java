package com.example.a8_session;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindPetrolEngine(PetrolEngine engine);
}
