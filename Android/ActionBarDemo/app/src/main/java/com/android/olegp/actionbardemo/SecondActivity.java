package com.android.olegp.actionbardemo;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toolbar tb2 = (Toolbar) findViewById(R.id.my_toolbar_2);
        setSupportActionBar(tb2);

        bt1 = (Button) findViewById(R.id.buttonNext);
        bt1.setOnClickListener(this);

     }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case (R.id.first_menu_item):
                Toast.makeText(this, "first", Toast.LENGTH_LONG).show();
                return true;
            case (R.id.second_menu_item):
                Toast.makeText(this, "second", Toast.LENGTH_LONG).show();
                return true;
            case (R.id.third_menu_item):
                Toast.makeText(this, "third", Toast.LENGTH_LONG).show();
                return true;
            case (R.id.forth_menu_item):
                Toast.makeText(this, "fourth", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInf = getMenuInflater();
        menuInf.inflate(R.menu.menu_actionbar, menu);

        return true;
    }

    @Override
    public void onClick(View v) {
        Intent intent  = new Intent(SecondActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
