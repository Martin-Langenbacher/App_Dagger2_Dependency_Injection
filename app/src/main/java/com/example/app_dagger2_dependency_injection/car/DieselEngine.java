package com.example.app_dagger2_dependency_injection.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "Car";

    // we own these classes:
    @Inject
    public DieselEngine() {}

    @Override
    public void start(){
        Log.d(TAG, "Diesel engine started");

    }
}
