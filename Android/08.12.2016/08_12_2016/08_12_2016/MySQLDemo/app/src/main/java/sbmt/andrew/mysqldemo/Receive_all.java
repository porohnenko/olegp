package sbmt.andrew.mysqldemo;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by HP02 on 08.12.2016.
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

            InputStream istream = connection.getInputStream();
            InputStreamReader readerStream = new InputStreamReader(istream);
            BufferedReader reader = new BufferedReader(readerStream);

            String line = "";
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
            }

            if (reader != null) reader.close();
            if (readerStream != null) readerStream.close();
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
                    Person p = new Person(js_person.getString("fname"),
                            js_person.getString("sname"),
                            js_person.getInt("age"),
                            js_person.getDouble("salary"));
                    p_array.add(p);
                }

                String out = "";
                for (int i = 0; i < p_array.size(); i++) {
                    out += p_array.get(i).toString();
                }
                MainActivity.tv.setText(out);
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
