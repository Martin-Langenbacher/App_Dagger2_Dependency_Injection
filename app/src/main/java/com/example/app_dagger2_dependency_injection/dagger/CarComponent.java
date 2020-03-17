package com.example.app_dagger2_dependency_injection.dagger;


// The componend is the most important in Dagger... !!!!!!!!!!!!!!!!!!
// Google "annotation components"

import com.example.app_dagger2_dependency_injection.MainActivity;
import com.example.app_dagger2_dependency_injection.car.Car;
import com.example.app_dagger2_dependency_injection.car.DieselEngine;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

// @Component (modules = {WheelsModule.class, PetrolEngineModule.class})
// we cannot put both DieselEngine and PetrolEngine into the {} below, because then Dagger don't know,
// which Engine to use...


// Singleton: The same driver (also the number - so exactly the same driver)...!

@Singleton
@Component (modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    Car getCar(); // this is just an interface - so no more needed...

    void inject(MainActivity mainActivity);

    // chapter 8: Inside this interface we add a nested interface...
    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);
        // Dagger knows only where ever there is an int return this value (150); it does not know about "horesPower"

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        CarComponent build();

    }



}
