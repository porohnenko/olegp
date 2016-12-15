package com.android.olegp.happynewyeargifts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    EditText giftName, giftPrice;
    Button addToDB, closeCard;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        giftName = (EditText) findViewById(R.id.editText_name);
        giftPrice = (EditText) findViewById(R.id.editText_price);
        giftName.setText("");
        giftPrice.setText("");
        addToDB = (Button) findViewById(R.id.button_add);
        closeCard = (Button) findViewById(R.id.button_close);
        addToDB.setOnClickListener(this);
        closeCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //if (v==)

    }
}
