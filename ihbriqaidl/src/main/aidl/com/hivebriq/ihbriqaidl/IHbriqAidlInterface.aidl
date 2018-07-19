// IHbriqAidlInterface.aidl
package com.hivebriq.ihbriqaidl;

// Declare any non-default types here with import statements

interface IHbriqAidlInterface {
    /**
    * get token for app
    */
    int getToken();

    /**
     * get application information w.r.t resource
     */
    String getAppInfo(String appId, int resId);

    /**
     * stop resource
     */
    void stop(int resId);


}
