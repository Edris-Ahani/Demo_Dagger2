package com.example.a6_session;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds//binds doesn't support any configuration
    abstract Engine bindPetrolEngine(PetrolEngine engine);
}
