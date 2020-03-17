package com.example.app_dagger2_dependency_injection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.app_dagger2_dependency_injection.car.Car;
import com.example.app_dagger2_dependency_injection.dagger.CarComponent;
import com.example.app_dagger2_dependency_injection.dagger.DaggerCarComponent;
import com.example.app_dagger2_dependency_injection.dagger.DieselEngineModule;

import java.util.stream.DoubleStream;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject Car car1, car2;
    //private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // chapter 8: We can extend builder().
        CarComponent component = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();

        //.dieselEngineModule(new DieselEngineModule(100))
        // If it does NOT work: Build + Rebuild Project...


        component.inject(this);
        // inject = Field-Injection
        //--> HomeWork: Ctrl + B ==> over DaggerCarComponent: You

        //car = component.getCar();
        car1.drive();
        car2.drive();


    }
}


/*
Injection simply means passing the dependancies from the outside

classes should not be responsible in creating or searching their dependent classes, instead,
these dependancies should be instanciated somewhere else and passes to the class that needs them.


Example of Dependancy:
RecyclerView depends on ----> Adapter
RecyclerView <---- dependancy of Adapter


Why should we use Dagger?
-->

 */