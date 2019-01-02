package com.example.markazinet.serviceapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class myservice extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
      //  return super.onStartCommand(intent, flags, startId);
        Toast.makeText(getApplicationContext(),"start for test",Toast.LENGTH_LONG).show();
        return START_NOT_STICKY;

    }

    @Override
    public boolean stopService(Intent name) {
        Toast.makeText(getApplicationContext(),"stop service",Toast.LENGTH_LONG).show();
        return true;

    }
}
