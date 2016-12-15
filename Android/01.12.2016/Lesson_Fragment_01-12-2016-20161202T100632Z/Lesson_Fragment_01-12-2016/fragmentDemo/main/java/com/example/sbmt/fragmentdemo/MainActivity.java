package com.example.sbmt.fragmentdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b_add, b_remove, b_replace, b_hello;
    CheckBox c_box;
    Fragment1 frag1;
    Fragment2 frag2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_add = (Button) findViewById(R.id.button_add);
        b_remove = (Button) findViewById(R.id.button_remove);
        b_replace = (Button) findViewById(R.id.button_replace);
        b_hello = (Button) findViewById(R.id.button_hello);
        b_hello.setOnClickListener(this);
        c_box = (CheckBox) findViewById(R.id.checkBox);
        b_add.setOnClickListener(this);
        b_remove.setOnClickListener(this);
        b_replace.setOnClickListener(this);
        //c_box.setOnClickListener(this);
        frag1 = new Fragment1();
        frag2 = new Fragment2();


    }

    @Override
    public void onClick(View v) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction trans = manager.beginTransaction();

        if (v==b_hello) {
            EditText edt = (EditText) frag1.getView().findViewById(R.id.editText_f1);
            edt.setText("Hello from Activity");
        }

        switch (v.getId()) {
            case (R.id.button_add):
                trans.add(R.id.fragment_place, frag1);
                break;
            case (R.id.button_remove):
                trans.remove(frag1);
                break;
            case (R.id.button_replace):
                trans.replace(R.id.fragment_place, frag2);
            default:
                break;
        }
        if (c_box.isChecked()) {
            trans.addToBackStack(null);
        }
        trans.commit();


    }
}
