package com.android.olegp.intentseconddemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.RatingBar;

/**
 * Created by olegp on 27.10.2016.
 */

public class InputActivity extends AppCompatActivity implements View.OnClickListener {

    EditText t_name, t_lname;
    NumberPicker nbpk;
    RatingBar rBar;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        t_name = (EditText) findViewById(R.id.editText);
        t_lname = (EditText) findViewById(R.id.editText2);
        nbpk = (NumberPicker) findViewById(R.id.numberPicker);
        rBar = (RatingBar) findViewById(R.id.ratingBar);
        b2 = (Button) findViewById(R.id.submitButton);
        b2.setOnClickListener(this);


        nbpk.setMinValue(18);
        nbpk.setMaxValue(65);
        nbpk.setValue(33);
    }

    @Override
    public void onClick(View v) {
        if (v==t_name){
            t_name.setText("");
        }
        Person rp = new Person(t_name.getText().toString(), t_lname.getText().toString(), nbpk.getValue(), rBar.getRating());
        Intent rintent = new Intent();
        rintent.putExtra("answer", rp);
        setResult(RESULT_OK, rintent);
        finish();
    }
}
