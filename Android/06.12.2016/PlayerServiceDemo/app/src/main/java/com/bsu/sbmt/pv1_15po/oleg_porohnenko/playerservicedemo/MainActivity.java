package com.bsu.sbmt.pv1_15po.oleg_porohnenko.playerservicedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void servStart(View v) {
        Intent startIntent = new Intent(this,MyService.class);
        startService(startIntent);
    }

    public void servStop(View v) {
        //Toast.makeText(this,"Service is stoped",Toast.LENGTH_LONG).show();
        Intent stopIntent = new Intent(this,MyService.class);
        stopService(stopIntent);
    }
}
