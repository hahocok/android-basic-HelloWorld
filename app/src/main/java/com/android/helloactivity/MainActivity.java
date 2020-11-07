package com.android.helloactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView greeting = (TextView) findViewById(R.id.greeting);
        String hello = getResources().getString(R.string.hello_geekbrains);
        hello += "!!";
        greeting.setText(hello);
    }
}