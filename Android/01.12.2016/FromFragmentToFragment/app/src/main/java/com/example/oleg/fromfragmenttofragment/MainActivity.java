package com.example.oleg.fromfragmenttofragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.example.oleg.fromfragmenttofragment.Fragment2.OnSmthListener_f2;
import static com.example.oleg.fromfragmenttofragment.Fragment1.*;

public class MainActivity extends AppCompatActivity implements OnSmthListener, OnSmthListener_f2 {

    EditText txt1, txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt2 = (EditText) findViewById(R.id.editText_mainAictivity);
    }

    @Override
    public void transmitData(String s) {
        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment1 = manager.findFragmentById(R.id.fragment2_l);
        txt1 = (EditText) fragment1.getView().findViewById(R.id.editText_F2);
        txt1.setText(s);
    }

    @Override
    public void transmitData_f2(String s) {
        txt2.setText(s);
    }
}
