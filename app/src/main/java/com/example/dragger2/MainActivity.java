package com.example.dragger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Engine engine=new Engine();
        Car hondaCar=new Car(engine);
        hondaCar.setWheels(new Wheels());
        hondaCar.drive();
    }
}