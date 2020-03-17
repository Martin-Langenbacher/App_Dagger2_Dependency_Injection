package com.example.app_dagger2_dependency_injection.dagger;

import com.example.app_dagger2_dependency_injection.car.Engine;
import com.example.app_dagger2_dependency_injection.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

    // long version:
    // Engine provideEngine(PetrolEngine engine) {
    //    return engine;
    //     }

}


