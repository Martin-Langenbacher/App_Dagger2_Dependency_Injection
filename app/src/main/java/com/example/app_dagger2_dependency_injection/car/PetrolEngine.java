package com.example.app_dagger2_dependency_injection.car;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    // we own these classes:
    @Inject
    public PetrolEngine() {}

    @Override
    public void start(){
        Log.d(TAG, "Petrol engine started");

    }

}
