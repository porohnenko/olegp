package com.example.oleg.fragmentdemo;

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
    Button b_add, b_remove, b_replace, b_tofrag;
    CheckBox checkBox;
    Fragment1 frag1;
    Fragment2 frag2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_add = (Button) findViewById(R.id.button_add);
        b_remove = (Button) findViewById(R.id.button_remove);
        b_replace = (Button) findViewById(R.id.button_replace);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        b_tofrag = (Button) findViewById(R.id.button_gfrag);


        b_add.setOnClickListener(this);
        b_remove.setOnClickListener(this);
        b_replace.setOnClickListener(this);
        checkBox.setOnClickListener(this);
        b_tofrag.setOnClickListener(this);

        frag1 = new Fragment1();
        frag2 = new Fragment2();

    }

    @Override
    public void onClick(View view) {
        FragmentManager manager = getSupportFragmentManager();

        if (view == b_tofrag) {
            EditText edt = (EditText) frag1.getView().findViewById(R.id.editText_f1);
            edt.setText("Hello from Activity");

        }

        FragmentTransaction transaction = manager.beginTransaction();

        switch (view.getId()) {
            case (R.id.button_add):
                transaction.add(R.id.fragment_place, frag1);
                break;
            case (R.id.button_remove):
                transaction.remove(frag1);
                break;
            case (R.id.button_replace):
                transaction.replace(R.id.fragment_place, frag2);
                break;
            default:
                break;

        }
        if (checkBox.isChecked()) transaction.addToBackStack(null);
        transaction.commit();
    }
}
