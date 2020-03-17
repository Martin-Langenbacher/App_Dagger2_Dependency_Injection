package com.example.app_dagger2_dependency_injection.dagger;

import com.example.app_dagger2_dependency_injection.car.Rims;
import com.example.app_dagger2_dependency_injection.car.Tires;
import com.example.app_dagger2_dependency_injection.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    Rims provideRims() {
        return new Rims();
    }

    @Provides
    Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }


}
