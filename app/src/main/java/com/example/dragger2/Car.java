package com.example.dragger2;

import android.util.Log;

import static androidx.constraintlayout.motion.utils.Oscillator.TAG;

public class Car {

    public Engine mEngine;

    private Wheels mWheels;

    public Car(Engine engine) {
        this.mEngine = engine;
    }

    public void setWheels(Wheels wheels) {
        this.mWheels = wheels;
    }


    public void drive(){
        Log.d(TAG, "drive: Vhroooooooom: Car is driving");
    }

}
