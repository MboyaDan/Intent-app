package com.example.admin.intentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Content_Activity_two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content__two);
        Bundle firstData=getIntent().getExtras();
        if(firstData==null)
        {
            return;
        }
        String firstmessage=firstData.getString("FirstMessage");
        final TextView secondtext= findViewById(R.id.SecondText);
        secondtext.setText(firstmessage);
    }
}
