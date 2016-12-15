package sbmt.android.andrew.lectionphotolist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class Person {
    public String sname;
    public String name;
    public int img;

    public Person(String s, String n, int img) {
        this.sname = s;
        this.name = n;
        this.img = img;
    }

    @Override
    public String toString() {
        return this.sname + ' ' + this.name;
    }
}

class PersonAdapter extends ArrayAdapter<Person>{
  Context context;
  ArrayList<Person> array;

    public PersonAdapter(Context context, ArrayList<Person> array) {
        super(context, android.R.layout.simple_list_item_1);
        this.context=context;
        this.array = array;
    }

    @Override
    public int getCount() {
        return array.size();
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        RelativeLayout layout;
        if(convertView==null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            layout = (RelativeLayout) inflater.inflate(R.layout.layout_item, parent, false);
        }
        else layout = (RelativeLayout) convertView;
            ImageView iw = (ImageView) layout.findViewById(R.id.imageView);
            TextView fam = (TextView) layout.findViewById(R.id.textFam);
            TextView name = (TextView) layout.findViewById(R.id.textName);

            Person p = array.get(position);

            fam.setText(p.sname);
            name.setText(p.name);
            iw.setImageResource(p.img);

            return layout;


    }


}


public class MainActivity extends AppCompatActivity {

    ArrayList<Person> array = new ArrayList<Person>();
    ListView lw;
    PersonAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        array.add(new Person("Петров","Иван Иванович",R.drawable.p1));
        array.add(new Person("Иванов","Иван Иванович",R.drawable.p2));
        array.add(new Person("Сидоров","Иван Иванович",R.drawable.man));
        array.add(new Person("Цветков","Иван Иванович",R.drawable.p3));
        array.add(new Person("Лашков","Иван Иванович",R.drawable.p4));
        array.add(new Person("Витковский","Иван Иванович",R.drawable.p5));
        array.add(new Person("Городец","Иван Иванович",R.drawable.p6));
        array.add(new Person("Богданов","Иван Иванович",R.drawable.emo_im_lips_are_sealed));


        lw = (ListView) findViewById(R.id.list_view);
        adapter = new PersonAdapter(this,array);

        lw.setAdapter(adapter);


    }
}
