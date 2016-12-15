package com.bsu.sbmt.pv1_15po.oleg_porohnenko.graphviewdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class MainActivity extends AppCompatActivity {

    GraphView graphView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        graphView = (GraphView) findViewById(R.id.my_graph);

        LineGraphSeries<DataPoint> series = new LineGraphSeries<>();
        LineGraphSeries<DataPoint> series2 = new LineGraphSeries<>();

        for(int i=0; i<11;i++){
            series.appendData(new DataPoint(50*i,i*i*i),true,10,false);
            series2.appendData(new DataPoint(i*30,i*(i+1)*i),true,10,false);
        }

        graphView.addSeries(series);
        graphView.addSeries(series2);

        graphView.getViewport().setXAxisBoundsManual(true);
        graphView.getViewport().setMaxX(1000.0);
        graphView.getViewport().setMinX(0.0);
        graphView.getViewport().setMaxY(5000.0);
        graphView.getViewport().setMinY(0.0);
        series.setColor(Color.parseColor("#e90808"));
        series.setThickness(7);
        series2.setThickness(14);

        graphView.getViewport().setScalable(true);
        graphView.getViewport().setScalableY(true);
        graphView.getViewport().setScrollable(true);
        graphView.getViewport().setScrollableY(true);

        graphView.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        series.setTitle("graph 1");

        StaticLabelsFormatter staticLabelsFormatter = new StaticLabelsFormatter(graphView);
        staticLabelsFormatter.setHorizontalLabels(new String[] {"old", "middle", "new"});
        staticLabelsFormatter.setVerticalLabels(new String[] {"low", "middle", "high"});
        graphView.getGridLabelRenderer().setLabelFormatter(staticLabelsFormatter);
    }
}
