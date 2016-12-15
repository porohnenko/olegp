package com.bsu.sbmt.pv1_15po.oleg_porohnenko.spinnerdialogdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.pickData);
        tv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == tv) {
            MyDatePicker mdp = new MyDatePicker();
            mdp.show(getSupportFragmentManager(),"my_date_picker");
        }
    }
}
