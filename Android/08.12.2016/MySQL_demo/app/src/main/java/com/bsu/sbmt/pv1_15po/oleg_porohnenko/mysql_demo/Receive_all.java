package com.bsu.sbmt.pv1_15po.oleg_porohnenko.mysql_demo;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import static com.bsu.sbmt.pv1_15po.oleg_porohnenko.mysql_demo.MainActivity.tv;

/**
 * Created by Oleg on 08.12.16.
 */

public class Receive_all extends AsyncTask<String, Integer, String> {

    StringBuffer buffer;
    ArrayList<Person> p_array;


    @Override
    protected String doInBackground(String... params) {

        buffer = new StringBuffer();
        p_array = new ArrayList<>();
        HttpURLConnection connection = null;

        try {
            URL url = new URL(params[0]);
            connection = (HttpURLConnection) url.openConnection();
            connection.connect();

            InputStream inputStream = connection.getInputStream();
            InputStreamReader streamReader = new InputStreamReader(inputStream, "iso-8859-1");
            BufferedReader reader = new BufferedReader(streamReader, 8);

            String line = "";

            while ((line = reader.readLine()) != null) {
                buffer.append(line);
            }

            if (reader != null) reader.close();
            if (streamReader != null) streamReader.close();
            if (connection != null) connection.disconnect();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        int success = 0;

        try {
            JSONObject object = new JSONObject(buffer.toString());
            success = object.getInt("success");

            if (success == 1) {
                JSONArray js_array = object.getJSONArray("persons");
                for (int i = 0; i < js_array.length(); i++) {
                    JSONObject js_person = js_array.getJSONObject(i);
                    Person p = new Person(js_person.getString("fname"), js_person.getString("sname"), js_person.getInt("age"), js_person.getDouble("salary"));
                    p_array.add(p);
                }

                String out = "";
                for (int i = 0; i < p_array.size(); i++) {
                    out += p_array.get(i).toString();
                }
                tv.setText(out);

            } else {
                String message = object.getString("message");
                tv.setText(message);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        if (buffer.toString() == "") {
            tv.setText("buffer is empty");
        } else {
            //tv.setText(buffer.toString());
        }
        //MainActivity.tv.setText(buffer.toString());
        super.onPostExecute(s);
    }
}
