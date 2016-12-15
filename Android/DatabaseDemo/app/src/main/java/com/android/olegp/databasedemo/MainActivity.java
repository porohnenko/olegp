package com.android.olegp.databasedemo;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv;
    Button bcreate, bselect;
    ArrayList<Person> array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textView_1);
        tv.setText("");
        bcreate = (Button) findViewById(R.id.button);
        bselect = (Button) findViewById(R.id.button2);
        bcreate.setOnClickListener(this);
        bselect.setOnClickListener(this);

        array = new ArrayList<Person>();
        for (int i = 0; i < 5; i++) {
            Person p = new Person("Name " + String.valueOf(i), "Surname " + String.valueOf(i), 20 + i);
            array.add(p);
        }
    }

    @Override
    public void onClick(View v) {
        if (v == bcreate) {
            MyDatabaseHelper helper = new MyDatabaseHelper(this);
            SQLiteDatabase db = helper.getWritableDatabase();

            for (int i = 0; i < array.size(); i++) {

                ContentValues cv = new ContentValues();
                cv.put("fname", array.get(i).fname);
                cv.put("lname", array.get(i).lname);
                cv.put("age", array.get(i).age);

                db.insert("persons", null, cv);
            }
            Toast.makeText(this, "Database is create", Toast.LENGTH_SHORT).show();
            helper.close();
        }
        if (v == bselect) {
            ArrayList<Person> sArray = new ArrayList<Person>();

            MyDatabaseHelper helper = new MyDatabaseHelper(this);
            SQLiteDatabase db = helper.getWritableDatabase();

            String[] fields = new String[]{"fname","age"};

            String selection = "age>?";
            String[] selectionArg = new String[]{"25"};
            //Cursor c = db.query("persons", fields, selection, selectionArg, null, null, null, null);
            Cursor c = db.query("persons", null, null, null, null, null, null, null);

            c.moveToFirst();

            while (!c.isAfterLast()) {
                String fn = c.getString(c.getColumnIndex("fname"));
                String ln = c.getString(c.getColumnIndex("lname"));
                int ag = c.getInt(c.getColumnIndex("age"));
                Person pp = new Person(fn, ln, ag);
                //Person pp = new Person(fn, ag);
                sArray.add(pp);
                c.moveToNext();
            }
            c.close();
            helper.close();

            tv.setText("");
            String out = "";
            Toast.makeText(this,String.valueOf(sArray.size()),Toast.LENGTH_LONG).show();
            for (int i = 0; i < sArray.size(); i++) {
                out += sArray.get(i).toString();
                //out += String.valueOf(i);
            }
             tv.setText(out);

        }
    }
}
