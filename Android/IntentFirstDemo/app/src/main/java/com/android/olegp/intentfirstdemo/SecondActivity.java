package com.android.olegp.intentfirstdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    Button b2;
    EditText txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        b2 = (Button) findViewById(R.id.button2);
        txt2 = (EditText) findViewById(R.id.EditText2);
        b2.setOnClickListener(this);
        Intent myIntent = getIntent();
        txt2.setText(myIntent.getStringExtra("message"));


    }

    @Override
    public void onClick(View v) {

        Intent answerIntent = new Intent();
        answerIntent.putExtra("answer", txt2.getText().toString());
        setResult(RESULT_OK, answerIntent);

        finish();
    }
}
