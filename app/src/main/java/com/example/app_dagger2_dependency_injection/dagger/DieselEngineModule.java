package com.example.app_dagger2_dependency_injection.dagger;

import com.example.app_dagger2_dependency_injection.car.DieselEngine;
import com.example.app_dagger2_dependency_injection.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);

    // long version:
    // Engine provideEngine(PetrolEngine engine) {
    //    return engine;
    //     }

}


