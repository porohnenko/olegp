package com.example.oleg.fromfragmenttofragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import com.example.oleg.fromfragmenttofragment.Fragment2.OnSmthListener_f2;

public class MainActivity extends AppCompatActivity implements OnSmthListener_f2 {

    EditText txt1, txt2, txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt2 = (EditText) findViewById(R.id.editText_mainAictivity);
    }



    @Override
    public void transmitData_f2(String s) {
//        FragmentManager manager = getSupportFragmentManager();
//        Fragment fragment = manager.findFragmentById(R.id.fragment1_l_new);

//        txt3 = (EditText)  fragment.getView().findViewById(R.id.editText_F1);
//        txt3.setText(s);

        txt2.setText(s);
    }
}
