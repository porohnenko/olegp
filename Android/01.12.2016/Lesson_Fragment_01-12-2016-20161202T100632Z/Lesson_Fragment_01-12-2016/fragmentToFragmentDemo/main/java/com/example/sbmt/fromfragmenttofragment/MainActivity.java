package com.example.sbmt.fromfragmenttofragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements Fragment1.OnSmthListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void transmitData(String s) {
        FragmentManager manager = getSupportFragmentManager();
        Fragment frg = manager.findFragmentById(R.id.fragment2_l);
        EditText txt =(EditText) frg.getView().findViewById(R.id.editText_f2);
        txt.setText(s);
    }
}
