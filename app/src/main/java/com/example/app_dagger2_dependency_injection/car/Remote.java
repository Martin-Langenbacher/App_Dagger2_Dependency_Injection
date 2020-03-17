package com.example.app_dagger2_dependency_injection.car;

import android.util.Log;

import javax.inject.Inject;

class Remote {

    private static final String TAG = "Car";

    @Inject
    public Remote(){

    }

    public void setListener(Car car) {
        Log.d(TAG, "Remote connected");
    }
}
