package com.android.olegp.happynewyeargifts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button sortByName, sortByPrice, editList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sortByName = (Button) findViewById(R.id.sortByName);
        sortByPrice = (Button) findViewById(R.id.sortByPrice);
        editList = (Button) findViewById(R.id.button_edit);
        sortByPrice.setOnClickListener(this);
        sortByName.setOnClickListener(this);
        editList.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==editList){
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }

    }
}
