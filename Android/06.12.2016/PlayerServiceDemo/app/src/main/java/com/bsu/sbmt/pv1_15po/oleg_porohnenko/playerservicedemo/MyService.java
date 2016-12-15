package com.bsu.sbmt.pv1_15po.oleg_porohnenko.playerservicedemo;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {

    MediaPlayer mp;

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_NOT_STICKY;
    }

    @Override
    public void onCreate() {

        mp = MediaPlayer.create(this, R.raw.papina_dochka);
        mp.setLooping(true);

        Toast.makeText(this, "Service is started", Toast.LENGTH_LONG).show();
        mp.start();

        super.onCreate();
    }

    @Override
    public void onDestroy() {
        mp.stop();
        Toast.makeText(this,"Service is stoped",Toast.LENGTH_LONG).show();
        super.onDestroy();
    }
}
