package com.example.app_dagger2_dependency_injection.dagger;

import com.example.app_dagger2_dependency_injection.car.Rims;
import com.example.app_dagger2_dependency_injection.car.Tires;
import com.example.app_dagger2_dependency_injection.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {
    // REMEMBER: If all of your "@Provides-Modules" are static, then you need to do the class abstract...

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }


}
