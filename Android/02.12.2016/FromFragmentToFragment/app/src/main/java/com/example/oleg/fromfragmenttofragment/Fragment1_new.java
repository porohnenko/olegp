package com.example.oleg.fromfragmenttofragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.oleg.fromfragmenttofragment.R.id.list_item;


/**
 * Created by Oleg on 03.12.16.
 */

public class Fragment1_new extends ListFragment {

    ArrayList<Person> arrayPerson;
    ArrayList<String> arrayNames;
    ArrayAdapter<String> adapter;
    ListView lv;

    //String data[] = new String[] { "one", "two", "three", "four" };

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(data!=null){
            Person pp = data.getParcelableExtra("answer");

            arrayPerson.add(pp);
            arrayNames.add(pp.lname);
            adapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        arrayPerson = new ArrayList<Person>();
        arrayNames = new ArrayList<String>();

        adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, arrayNames);
        setListAdapter(adapter);
    }
}
