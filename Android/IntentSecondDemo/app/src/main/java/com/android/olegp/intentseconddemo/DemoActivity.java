package com.android.olegp.intentseconddemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class DemoActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
    public static final String MY_ACTION = "com.android.olegp.my_action";
    ListView lw;
    Button btn;
    ArrayList<Person> arrayPerson;
    ArrayList<String> arrayNames;
    ArrayAdapter adapter;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            Person pp = data.getParcelableExtra("answer");
            arrayPerson.add(pp);
            arrayNames.add(pp.lname);
            adapter.notifyDataSetChanged();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        lw = (ListView) findViewById(R.id.listView);

        arrayPerson = new ArrayList<Person>();
        arrayNames = new ArrayList<String>();

        Person p = new Person("Oleg", "Porohnenko", 29, 4.5f);
        arrayPerson.add(p);
        arrayNames.add(p.lname);

        adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, arrayNames);
        lw.setAdapter(adapter);
        lw.setOnItemClickListener(this);

        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(), arrayPerson.get(position).toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        //Intent startIntent  = new Intent(this, InputActivity.class);
        Intent startIntent = new Intent(MY_ACTION);
        startActivityForResult(startIntent, 5);
    }
}
