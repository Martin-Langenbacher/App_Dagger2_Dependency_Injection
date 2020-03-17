package com.example.app_dagger2_dependency_injection.dagger;

import com.example.app_dagger2_dependency_injection.car.DieselEngine;
import com.example.app_dagger2_dependency_injection.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    // creates a provide module for it:
    // so dagger can use it whenever it is needed - not only as in the constructor "provideEngine" below...

    @Provides
    int provideHoresPower(){
        return horsePower;
    }

    // chapter 5 or 6: @Binds
    @Provides
    Engine provideEngine(DieselEngine engine){
        return engine;
    }

    // long version:
    // Engine provideEngine(PetrolEngine engine) {
    //    return engine;
    //     }

}


