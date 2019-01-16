package com.example.markazinet.serviceapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.Toast;

public class myservice extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return mBind;
    }

    private final JoApp.Stub mBind=new JoApp.Stub() {
        public void firstmethod(){
        Toast.makeText(getApplicationContext(),"hello service",Toast.LENGTH_LONG).show();

        };

        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

        }
    };




}
