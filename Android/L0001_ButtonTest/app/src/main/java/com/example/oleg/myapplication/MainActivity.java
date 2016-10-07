package com.example.oleg.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayoutCompat myLayout = new LinearLayoutCompat(this);
        myLayout.setOrientation(LinearLayoutCompat.VERTICAL);
        textView = new TextView(this);
        textView.setText("Nothing yet");
        textView.setTextSize(30);
        textView.setTextColor(Color.parseColor("#BB070600"));
        myLayout.addView(textView);

        btn1 = new Button(this);
        btn1.setText("Press here 1");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Pressed button 1");
                btn1.setBackgroundColor(Color.parseColor("#CC04CC08"));
            }
        });

        btn2 = new Button(this);
        btn2.setText("Press here 2");
        textView.setTextColor(Color.parseColor("#CCBB08"));
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Pressed button 2");
                btn1.setBackgroundColor(Color.parseColor("#BB0706"));
            }
        });

        myLayout.addView(btn1);
        myLayout.addView(btn2);
        setContentView(myLayout);
    }
}
