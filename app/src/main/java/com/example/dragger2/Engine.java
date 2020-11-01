package com.example.dragger2;

import android.util.Log;

import static android.content.ContentValues.TAG;

public class Engine {

    private SparkPlug mSparkPlug;
    private CrankShaft mCrankShaft;
    private Piston mPiston;

    public Engine() {

        mCrankShaft=new CrankShaft();
        mPiston=new Piston();
        mSparkPlug=new SparkPlug();

    }


    public static void status() {
        Log.d(TAG, "status: Engine is not ready, create engine object");
    }

    public void start() {
        Log.d(TAG, "start: Engine started");
    }
}