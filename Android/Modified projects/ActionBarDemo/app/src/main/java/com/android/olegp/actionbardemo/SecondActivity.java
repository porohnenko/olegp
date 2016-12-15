package com.android.olegp.actionbardemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt1;
    DrawerLayout d_layout;
    LinearLayout drawer;
    ActionBarDrawerToggle toogle;
    TextView tv1, tv2, tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mydrawer_layout);

        Toolbar tb2 = (Toolbar) findViewById(R.id.my_toolbar_2);
        setSupportActionBar(tb2);

        bt1 = (Button) findViewById(R.id.buttonNext);
        bt1.setOnClickListener(this);

        d_layout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer = (LinearLayout) findViewById(R.id.drawer);
        toogle = new ActionBarDrawerToggle(this, d_layout, tb2, R.string.opened, R.string.closed);
        toogle.syncState();

        tv1 = (TextView) findViewById(R.id.option_1);
        tv2 = (TextView) findViewById(R.id.option_2);
        tv3 = (TextView) findViewById(R.id.text_tv3);
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);


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
        if (v == tv1) {
            Intent intent1 = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(intent1);
        } else if (v == tv2) {
            d_layout.closeDrawer(drawer);
            tv3.setText("pressed button tv3");
        } else if (v==bt1){
            Intent intent2 = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(intent2);
        }
    }
}
