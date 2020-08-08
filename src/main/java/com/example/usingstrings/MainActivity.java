package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView2 =findViewById(R.id.textView2);
        textView2.setText(R.string.Msg2);

        Log.i("Lifecycle", "On create called...");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("Lifecycle", "On Start called...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle", "On resume ....");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle", "On Pause .....");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle", "On Stop called...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle", "On destroy called... ");

    }
}