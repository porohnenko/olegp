package com.bsu.sbmt.pv1_15po.oleg_porohnenko.mysql_noserver;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String url_db = "jdbc:mysql://192.168.43.235:3306/persons";
    public static TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView);
    }

    public void bSelectClick(View v) {
        DoSelection ds = new DoSelection();
        ds.execute(url_db);
    }
}
