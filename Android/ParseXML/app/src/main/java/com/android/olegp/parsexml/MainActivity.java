package com.android.olegp.parsexml;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String DOWNLOAD_PATH = "http://timetable.sbmt.by/android/test/test1.xml";
    //public static final String DOWNLOAD_PATH = "http://w1.weather.gov/xml/current_obs/all_xml.zip";
    public File SAVE_PATH = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
    Button bload;
    Button unparse;
    TextView txt;
    ProgressDialog pd;

    ArrayList<String> names, jobs, hobbies;
    ArrayList<Integer> ages;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bload = (Button) findViewById(R.id.DownloadButton);
        bload.setOnClickListener(this);

        txt = (TextView) findViewById(R.id.textView);
        txt.setOnClickListener(this);

        pd = new ProgressDialog(this);
        pd.setIndeterminate(false);
        pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        pd.setMax(100);
        pd.setProgress(0);

        unparse = (Button) findViewById(R.id.UnparseButton);
        unparse.setOnClickListener(this);

        names = new ArrayList<String>();
        jobs = new ArrayList<String>();
        hobbies = new ArrayList<String>();
        ages = new ArrayList<Integer>();


        int MY_PERMISSIONS_REQUEST = 10;
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, MY_PERMISSIONS_REQUEST);
        }
    }


    @Override
    public void onClick(View v) {
        if (v == bload) {
            Dowloader dwn = new Dowloader();
            dwn.execute(DOWNLOAD_PATH);
        }

        if (v == unparse) {
            try {
                XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
                XmlPullParser parser = factory.newPullParser();
                File inFile = new File(SAVE_PATH, "test.xml");
                InputStream istr = new FileInputStream(inFile);

                parser.setInput(istr, null);
                int eventType = parser.getEventType();

                String text = "";
                while (eventType != XmlPullParser.END_DOCUMENT) {
                    String nextTag = parser.getName();
                    switch (eventType) {
                        case XmlPullParser.TEXT:
                            text = parser.getText();
                            break;
                        case XmlPullParser.END_TAG:
                            if (nextTag.equalsIgnoreCase("name")) names.add(text);
                            if (nextTag.equalsIgnoreCase("age")) ages.add(Integer.decode(text));
                            if (nextTag.equalsIgnoreCase("job")) jobs.add(text);
                            if (nextTag.equalsIgnoreCase("hobby")) hobbies.add(text);
                            break;
                        default:
                            break;

                    }
                    eventType = parser.next();
                    if (istr != null) istr.close();
                }


            } catch (XmlPullParserException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String rezult = "";
            for (int i = 0; i < names.size(); i++) {
                rezult += names.get(i) + "," + ages.get(i).toString() + "," + jobs.get(i) + "," + hobbies.get(i);
            }
            txt.setText(rezult);
        }
    }

    class Dowloader extends AsyncTask<String, Integer, String> {

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            pd.setProgress(values[0]);
        }

        @Override
        protected String doInBackground(String... params) {
            InputStream inputStream = null;
            OutputStream outputStream = null;
            HttpURLConnection connection = null;

            try {
                URL url = new URL(params[0]);
                connection = (HttpURLConnection) url.openConnection();
                connection.connect();

                if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                    return "Error: " + connection.getResponseCode() + " " + connection.getResponseMessage();
                }

                inputStream = connection.getInputStream();
                File outFile = new File(SAVE_PATH, "text.xml");
                outputStream = new FileOutputStream(outFile);
                byte buffer[] = new byte[4096];
                long fileLength = connection.getContentLength();
                long total = 0l;
                int count = 0;


                while ((count = inputStream.read(buffer)) != -1) {

                    total += count;
                    outputStream.write(buffer, 0, count);

                    if (fileLength > 0) publishProgress((int) (total * 100 / fileLength));
                }

            } catch (IOException e) {
                e.printStackTrace();

            } finally {
                try {
                    if (inputStream != null) inputStream.close();
                    if (outputStream != null) outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                connection.disconnect();
            }

            return null;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pd.show();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            txt.setText("Download complete");
            pd.dismiss();
        }
    }
}
