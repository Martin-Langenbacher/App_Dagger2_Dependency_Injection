package com.example.app_dagger2_dependency_injection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject Car car;
    //private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.create();
        component.inject(this);
        // inject = Field-Injection
        //--> HomeWork: Ctrl + B ==> over DaggerCarComponent: You

        //car = component.getCar();
        car.drive();






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