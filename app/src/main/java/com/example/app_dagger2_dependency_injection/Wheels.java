package com.example.app_dagger2_dependency_injection;

import javax.inject.Inject;

public class Wheels {
    // we don't own this class (only as an example of real lifeI so we can't annotate it with @Inject
    // as in the previous examples. Now: We do a Rims- and a Tires-Class additionally!

    private Rims rims;
    private Tires tires;


    //=================================================================================
    // ... also in Wheels-class: empty constructor...!
    // example until chapter 5...
    //@Inject
    //public Wheels () {
    //   }


    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }

}
