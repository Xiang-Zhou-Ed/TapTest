package com.s1920393.taptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void TapTest(View view) {
        Intent intent = new Intent(this, TapTest.class);
        startActivity(intent);
    }

    public void TracingTest(View view) {
        Intent intent = new Intent(this, TracingTest.class);
        startActivity(intent);
    }
}
