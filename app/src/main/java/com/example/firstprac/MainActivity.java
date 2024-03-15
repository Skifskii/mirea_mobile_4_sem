package com.example.firstprac;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private final String TAG = this.getClass().getSimpleName();

    Context context = MainActivity.this;

    int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");
        Toast.makeText(context, "onCreate", duration).show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
        Toast.makeText(context, "onStart", duration).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
        Toast.makeText(context, "onStop", duration).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
        Toast.makeText(context, "onDestroy", duration).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
        Toast.makeText(context, "onPause", duration).show();
    }
    @Override
    protected void onResume() {
        super.onResume();;
        Log.i(TAG, "onResume");
        Toast.makeText(context, "onResume", duration).show();
    }
}