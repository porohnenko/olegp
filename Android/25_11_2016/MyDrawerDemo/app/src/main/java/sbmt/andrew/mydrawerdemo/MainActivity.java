package sbmt.andrew.mydrawerdemo;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mydrawer_layout);
        TextView p1 = (TextView) findViewById(R.id.punkt1);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.main_text);
                tv.setText("Выбран пункт 1");
                DrawerLayout drw_lay = (DrawerLayout) findViewById(R.id.drawer_layout);
                //LinearLayout drawer = (LinearLayout) findViewById(R.id.drawer);
                //drw_lay.closeDrawer(drawer);
            }
        });

    }
}
