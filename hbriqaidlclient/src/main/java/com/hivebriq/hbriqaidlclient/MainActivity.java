package com.hivebriq.hbriqaidlclient;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.hivebriq.ihbriqaidl.IHbriqAidlInterface;

public class MainActivity extends AppCompatActivity implements ServiceConnection  {

    String TAG = "HbriqAidlClient";
    private IHbriqAidlInterface service;
    public TextView mText1;
    public TextView mText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText1 = (TextView) findViewById(R.id.textView);
        mText2 = (TextView) findViewById(R.id.textView2);
    }

    public void onConnect(View v) {
        Log.d(TAG, "OnConnect");
        boolean res = bindService(new Intent("com.hivebriq.hbriqaidlserver.HbriqAidlService").setPackage("com.hivebriq.hbriqaidlserver")
                ,this,BIND_AUTO_CREATE);
        Log.d(TAG, "bindService, res:" + res);

    }

    public void onGetToken(View v) throws RemoteException {
        Log.d(TAG, "onGetToken");
        if(service != null) {
            int res = service.getToken();
            Log.d(TAG, "Result:" + res);
            mText1.setText(String.valueOf(res));
        }
    }

    public void onGetAppInfo(View v) throws RemoteException {
        Log.d(TAG, "onGetAppInfo");
        if(service != null) {
            String res = service.getAppInfo("com.hivebriq.hbriqaidlclient", 2);
            Log.d(TAG, "Result:" + res);
            mText2.setText(res);
        }
    }
    @Override
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.d(TAG, "onServiceConnected");
        service = IHbriqAidlInterface.Stub.asInterface(iBinder);
    }

    @Override
    public void onServiceDisconnected(ComponentName componentName) {
        Log.d(TAG, "onServiceDisconnected");
    }

}
