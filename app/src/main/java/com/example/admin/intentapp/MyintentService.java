package com.example.admin.intentapp;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import static android.support.constraint.Constraints.TAG;

public class MyintentService extends IntentService {
    private static final String LOG=" com.example.admin.intentapp";
    public MyintentService() {
        super("MyintentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(TAG, "The service has started ");
    }
}
