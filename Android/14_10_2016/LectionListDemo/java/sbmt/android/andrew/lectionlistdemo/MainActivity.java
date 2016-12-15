package sbmt.android.andrew.lectionlistdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener,AdapterView.OnItemClickListener{
    EditText tw;
    Button btn1;
    Button btn2;
    ListView lw;
    ArrayAdapter<String> adapter;
    ArrayList<String> array = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        btn1 = (Button) findViewById(R.id.button_add);
        btn2 = (Button) findViewById(R.id.button_delete);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

        lw = (ListView) findViewById(R.id.list_view);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,array);
        lw.setOnItemClickListener(this);

        tw = (EditText) findViewById(R.id.textView);
        array.add("Иванов");
        array.add("Петров");
        array.add("Сидоров");
        array.add("Сплендер");
        array.add("Кононов");
        lw.setAdapter(adapter);
    }


    @Override
    public void onClick(View v) {
        if(v==btn1){
        array.add(tw.getText().toString());
        adapter.notifyDataSetChanged();
        }
        if(v==btn2){
         array.remove(array.indexOf(tw.getText().toString()));
         adapter.notifyDataSetChanged();
        }

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Toast.makeText(getApplicationContext(),array.get(position),Toast.LENGTH_SHORT).show();

    }
}

