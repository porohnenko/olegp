package com.example.oleg.pagerpersonsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RatingBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RatingBar rb;
    ArrayList<Person> arrayPerson;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb = (RatingBar) findViewById(R.id.ratingBar);
        rb.setMax(5);
        rb.setRating(4);

        Person man1 = new Person("Oleg","Porohnenko",28,4.5f);
        Person man2 = new Person("Ivan","Ivanov",20,4.0f);
        Person man3 = new Person("Petr","Sidorov",30,3.5f);
        Person man4 = new Person("Mike","Flatrow",35,4.1f);

        arrayPerson.add(man1);
        arrayPerson.add(man2);
        arrayPerson.add(man3);
        arrayPerson.add(man4);


    }

    @Override
    public void onClick(View view) {

    }
}
