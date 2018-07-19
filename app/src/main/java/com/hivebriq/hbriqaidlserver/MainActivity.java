package com.hivebriq.hbriqaidlserver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String TAG = "HbriqAidlServer";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStartService(View view) {
        Log.d(TAG, "start service");
        startService(new Intent(this,HbriqAidlService.class));
    }
    public void onStopService(View view) {
        Log.d(TAG, "stop service");
        stopService(new Intent(this,HbriqAidlService.class));
    }
}
