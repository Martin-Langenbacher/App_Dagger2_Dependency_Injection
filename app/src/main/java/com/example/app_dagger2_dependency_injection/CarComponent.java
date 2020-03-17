package com.example.app_dagger2_dependency_injection;


// The componend is the most important in Dagger... !!!!!!!!!!!!!!!!!!
// Google "annotation components"

import dagger.Component;

@Component (modules = WheelsModule.class)
public interface CarComponent {

    Car getCar(); // this is just an interface - so no more needed...

    void inject(MainActivity mainActivity);







}
