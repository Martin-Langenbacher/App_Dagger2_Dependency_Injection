package com.example.app_dagger2_dependency_injection.car;

import android.util.Log;

import javax.inject.Inject;

import dagger.Module;

public class DieselEngine implements Engine {
    private static final String TAG = "Car";

    private int horsePower;

    // we own these classes:
    // @Inject - delete in chapter 7
    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start(){
        Log.d(TAG, "Diesel engine started. Horsepower: " +horsePower);
    }
}
