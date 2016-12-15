package com.bsu.sbmt.pv1_15po.oleg_porohnenko.mysql_demo;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Oleg on 09.12.16.
 */

public class Receive_one extends AsyncTask<String, Integer, String> {

    StringBuffer buffer;


    @Override
    protected String doInBackground(String... params) {

        buffer = new StringBuffer();
        HttpURLConnection connection = null;
        byte[] data = null;

        try {
            URL url = new URL(params[0]);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
////////////////////////////////////////////////////////////////////////////////////////////////////
            //для разделения потоков
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestProperty("Content-Length", "" +
                    Integer.toString(params[1].getBytes().length));

            OutputStream os = connection.getOutputStream();
            data = params[1].getBytes("UTF-8");
            os.write(data);

            connection.connect();
            data = null;
////////////////////////////////////////////////////////////////////////////////////////////////////
            InputStream inputStream = connection.getInputStream();
            InputStreamReader streamReader = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(streamReader);

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
                JSONObject js_person = js_array.getJSONObject(0);
                Person p = new Person(js_person.getString("fname"),
                        js_person.getString("sname"),
                        js_person.getInt("age"),
                        js_person.getDouble("salary"));
                MainActivity.tv.setText(p.toString());
            } else {
                String message = object.getString("message");
                MainActivity.tv.setText(message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onPostExecute(s);
    }
}
