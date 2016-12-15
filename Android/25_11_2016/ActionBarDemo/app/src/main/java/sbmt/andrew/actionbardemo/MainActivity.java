package sbmt.andrew.actionbardemo;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    DrawerLayout d_layout;
    LinearLayout drawer;
    ActionBarDrawerToggle toggle;
    TextView tv1,tv2, tv3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mydrawer_layout);
        Toolbar tb = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(tb);
        Button b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(this);

        d_layout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer = (LinearLayout) findViewById(R.id.drawer);
        toggle = new ActionBarDrawerToggle(this,d_layout,tb,R.string.opened,R.string.closed);
        d_layout.addDrawerListener(toggle);
        toggle.syncState();
        tv1 = (TextView) findViewById(R.id.option1);
        tv2 = (TextView) findViewById(R.id.option2);
        tv3 = (TextView) findViewById(R.id.main_txt);
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInf = getMenuInflater();
        menuInf.inflate(R.menu.menu_actionbar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case(R.id.first_menu_item):
        Toast.makeText(this, "Первая", Toast.LENGTH_LONG).show();
        return true;
        case(R.id.second_menu_item):
         Toast.makeText(this, "Вторая", Toast.LENGTH_LONG).show();
         return true;

   case(R.id.third_menu_item):
   Toast.makeText(this, "УРА!!", Toast.LENGTH_LONG).show();
   return true;

         default:  return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View v) {
        if (v==tv1) {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }else if (v==tv2){
            d_layout.closeDrawer(drawer);
            tv3.setText("Меня выбрали...");

        }
    }
}
