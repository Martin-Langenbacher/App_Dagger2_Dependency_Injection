package com.example.app_dagger2_dependency_injection.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    private int horsePower;
    private int engineCapacity;

    // we own these classes:
    @Inject
    public PetrolEngine(@Named("horse power") int horsePower,
                        @Named("engine capacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start(){
        Log.d(TAG, "Petrol engine started. " +
                "\nHorsepower: " + horsePower +
                "\nEngine Capacity: " + engineCapacity);
        // we still want to pass this value at runtime, but we will do it in a different way,
        // compared with DieselEngine...
        // For this, we go to CarComponent


    }

}
