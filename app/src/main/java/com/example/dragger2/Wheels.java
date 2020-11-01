package com.example.dragger2;

import android.util.Log;

import static android.content.ContentValues.TAG;

public class Wheels {

    private Frame mFrame;
    private Rubber mRubberType;

    public Wheels() {

        mFrame=new Frame();
        mRubberType=new Rubber();

    }

    public void inflate() {
        Log.d(TAG, "inflate: Wheels inflated");
    }
}