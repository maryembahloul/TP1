package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World");
        Log.d("Question1:", "Réponse: activity_main.xml\n");
        Log.d("Question2:", "Réponse: app_name\n");
        Log.d("Question3:", "Réponse: AVD Manager\n\n");
        Log.d("Question3:", "Réponse: Debug\n\n");


    }
}
