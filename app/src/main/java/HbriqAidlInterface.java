package com.hivebriq.hbriqaidlserver;

import android.util.Log;

import com.hivebriq.ihbriqaidl.IHbriqAidlInterface;

/**
 * Created by satishp7 on 19/7/18.
 */

public class HbriqAidlInterface extends IHbriqAidlInterface.Stub {
    String TAG = "HbriqAidlInterface";

    @Override
    public int getToken(){
        Log.d(TAG,"getToken");
        return 1;
    }

    @Override
    public String getAppInfo(String app, int resId){
        Log.d(TAG,"getAppInfo, appId:" + app);
        Log.d(TAG,"getAppInfo, resId:" + resId);
        return "HbriqAidlInterface";

    }

    @Override
    public void stop(int resId){
        Log.d(TAG,"stop");
        return;
    }
}
