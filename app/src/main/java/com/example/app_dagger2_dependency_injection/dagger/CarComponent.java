package com.example.app_dagger2_dependency_injection.dagger;


// The componend is the most important in Dagger... !!!!!!!!!!!!!!!!!!
// Google "annotation components"

import com.example.app_dagger2_dependency_injection.MainActivity;
import com.example.app_dagger2_dependency_injection.car.Car;
import com.example.app_dagger2_dependency_injection.car.DieselEngine;

import dagger.Component;

// @Component (modules = {WheelsModule.class, PetrolEngineModule.class})
// we cannot put both DieselEngine and PetrolEngine into the {} below, because then Dagger don't know,
// which Engine to use...

@Component (modules = {WheelsModule.class, DieselEngine.class})
public interface CarComponent {

    Car getCar(); // this is just an interface - so no more needed...

    void inject(MainActivity mainActivity);







}
