package com.example.a5_session;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindPetrolEngine(DieselEngine engine);
}
