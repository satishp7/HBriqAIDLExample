package com.hivebriq.hbriqaidlserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class HbriqAidlService extends Service {

    String TAG = "HbriqAidlService";
    public HbriqAidlService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        Log.d(TAG, "onBind");
        return new HbriqAidlInterface();
    }
    @Override
    public void onCreate() {
        Toast.makeText(this,"AIDL server start", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onDestroy() {
        Toast.makeText(this,"AIDL server stop", Toast.LENGTH_LONG).show();
    }
}
