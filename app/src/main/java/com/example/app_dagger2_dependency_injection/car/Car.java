package com.example.app_dagger2_dependency_injection.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    // capter 5? --> @Inject Engine engine;
    private Driver driver;
    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.driver = driver;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }


    public void drive(){
        engine.start();
        Log.d(TAG, driver + " drives " + this);
        //this is the car instances...

    }



}
