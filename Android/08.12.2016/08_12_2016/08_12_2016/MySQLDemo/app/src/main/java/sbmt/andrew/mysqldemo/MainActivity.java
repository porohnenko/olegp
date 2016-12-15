package sbmt.andrew.mysqldemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String url_get_all = "http://192.168.43.235/read_all.php";
    String url_get_one = "http://192.168.43.235/read_one.php";
    String url_insert_one = "http://192.168.43.235/insert_one.php";
    String url_insert_many = "http://192.168.43.235/insert_many.php";
    String url_delete_one = "http://192.168.43.235/delete_one.php";

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
}
