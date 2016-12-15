package com.example.oleg.fromfragmenttofragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;

import java.util.ArrayList;

/**
 * Created by Oleg on 01.12.16.
 */

public class Fragment2 extends Fragment implements View.OnClickListener {

    Button b_transmit;
    EditText editTxt_f2, name, surname;
    NumberPicker age;
    OnSmthListener_f2 smthListener_f2;


    public interface OnSmthListener_f2 {
        public void transmitData_f2(String s);
    }

    public interface TrasmitList {
        public void transmitList_f2tof1(ArrayList<Person> person);
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        smthListener_f2 = (OnSmthListener_f2) context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment2_layout, null);

        name = (EditText) v.findViewById(R.id.edit_name);
        surname = (EditText) v.findViewById(R.id.edit_surname);
        age = (NumberPicker) v.findViewById(R.id.numberPicker);

        b_transmit = (Button) v.findViewById(R.id.button_transmit);
        b_transmit.setOnClickListener(this);


        editTxt_f2 = (EditText) v.findViewById(R.id.edit_surname);

        return v;
    }

    @Override
    public void onClick(View view) {
//        if (view == b_transmit) {
//            String s = editTxt_f2.getText().toString();
//            smthListener_f2.transmitData_f2(s);
//        }

        Person person = new Person(name.getText().toString(), surname.getText().toString(), age.getValue());
        Bundle bundle = new Bundle();
        bundle.putParcelable("key", person);
        Fragment1

    }


}
