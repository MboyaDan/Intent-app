package com.example.admin.intentapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    public static final String TAG=" com.example.admin.intentapp";

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG,"On start called");
        Runnable r=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    long futuretime=System.currentTimeMillis()+5000;
                    while(System.currentTimeMillis()<futuretime){
                        synchronized (this){
                            try{
wait(futuretime-System.currentTimeMillis());
Log.i(TAG,"Service is running");
                        }catch (Exception e){}

                        }

                    }
                }
            }
        };
        Thread mythread=new Thread(r);
        mythread.start();
        return Service.START_STICKY;
    }

    @Override
    public void onDestroy() {
      Log.i(TAG,"OnDestroy called");
    }

    public MyService() {

    }

    @Override
    public IBinder onBind(Intent intent) {
       return  null;
    }
}
