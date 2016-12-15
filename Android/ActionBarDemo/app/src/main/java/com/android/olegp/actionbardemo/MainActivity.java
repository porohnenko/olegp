package com.android.olegp.actionbardemo;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar tb = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(tb);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setTitle("main activity");

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
                Toast.makeText(this, "first", Toast.LENGTH_LONG).show();
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
}
