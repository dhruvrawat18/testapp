package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class NamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_names);

        String[] names = {"Rahul", "Rajesh", "Rohan", "Raj", "Jagdish"};
        int rnd = new Random().nextInt(names.length);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(names[rnd]);
    }
}