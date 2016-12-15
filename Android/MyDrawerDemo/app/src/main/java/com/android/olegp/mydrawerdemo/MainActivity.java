package com.android.olegp.mydrawerdemo;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView p1 = (TextView) findViewById(R.id.punkt1);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.punkt1);
                tv.setText("Selected something");
                DrawerLayout drw_lay =(DrawerLayout) findViewById(R.id.drawer_layout);
                LinearLayout drawer = (LinearLayout) findViewById(R.id.drawer);
                drw_lay.closeDrawer(drawer);
            }
        });


    }
}
