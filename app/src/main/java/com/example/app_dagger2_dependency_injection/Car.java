package com.example.app_dagger2_dependency_injection;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }


    public void drive(){
        Log.d(TAG, "driving...");


    }





}
