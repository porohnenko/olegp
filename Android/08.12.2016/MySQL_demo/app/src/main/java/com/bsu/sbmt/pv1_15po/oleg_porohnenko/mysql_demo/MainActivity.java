package com.bsu.sbmt.pv1_15po.oleg_porohnenko.mysql_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    String url_get_all = "http://192.168.100.12/sql/read_all.php";
    String url_get_one = "http://192.168.100.12/sql/read_one.php";
    String url_insert_one = "http://192.168.100.12/sql/insert_one.php";
    String url_insert_many = "http://192.168.100.12/sql/insert_many.php";
    String url_delete_one = "http://192.168.100.12/sql/delete_one.php";



    public static TextView tv;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView);
    }

    public void bSelectAllClick(View v) {
        Receive_all ra = new Receive_all();
        ra.execute(url_get_all);
    }

    public void bSelectOneClick(View v) {
        String param = "sname='porohnenko'";

        Receive_one ro = new Receive_one();
        ro.execute(url_get_one, param);
    }

    public void bInsertOneClick(View v) {
        String param = "fname='Алеша'&sname='Везучий'&age='30'&salary='2000.5'";
        //String param = "fname='Алеша'&sname='" + note_1 + "'&age='30'&salary='2000.5'";

        OtherActions otAc = new OtherActions();
        otAc.execute(url_insert_one, param);
    }

    public void bDeleteOneClick(View v) {
        String param = "fname='Алеша'";

        OtherActions otAc = new OtherActions();
        otAc.execute(url_delete_one, param);
    }

    public void bInsertManyClick(View v) {
        JSONObject js_obj;
        JSONArray js_array = new JSONArray();
        Person p;

        for (int i = 0; i < 5; i++) {
            p = new Person("Name" + i, "Surname" + i, i * 10, 200.5 * i);
            try {
                js_obj = new JSONObject(p.toJSON());
                js_array.put(js_obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String param = "objects=" + js_array.toString();
       //tv.setText(out);
        OtherActions otAc = new OtherActions();
        otAc.execute(url_insert_many, param);
    }
}
