package sbmt.andrew.actionbardemo;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar tb2 = (Toolbar) findViewById(R.id.my_toolbar2);
        setSupportActionBar(tb2);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setTitle("2-nd Activity");
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
                Toast.makeText(this, "Первый Рисунок", Toast.LENGTH_LONG).show();
                return true;
            case(R.id.second_menu_item):
                Toast.makeText(this, "Второй Рисунок", Toast.LENGTH_LONG).show();
                return true;

            case(R.id.third_menu_item):
                Toast.makeText(this, "И Все!", Toast.LENGTH_LONG).show();
                return true;

            default:  return super.onOptionsItemSelected(item);
        }
    }

}
