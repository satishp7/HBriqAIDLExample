# HBriqAIDLExample

Android AIDL example
</br>

<b> Source components: </b> </br>
app : AIDL service part </br>
hbriqaidlclient : AIDL client part </br>
hbriqaidl : AIDL interface </br>

</br>
<b> Build: </b> </br>
export ANDROID_HOME to sdk path </br>
For debug apk: </br>
$ ./gradlew assembleDebug </br>

</br>
<b> Run: </b> </br>
Install generate apk file to target </br>
e.g. </br>
adb install ./hbriqaidlclient/build/outputs/apk/debug/hbriqaidlclient-debug.apk </br>
adb install ./app/build/outputs/apk/debug/app-debug.apk </br>

</br>
<b> Validate: </b> </br>
- Launch hbriqaidlclient app </br>
- "connect" to connect with the service </br>
- "getToken" to call getToken app to remote service - hbriqAidlService </br>

