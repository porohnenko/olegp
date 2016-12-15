package com.example.sbmt.fromfragmenttofragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by sbmt on 01.12.2016.
 */

public class Fragment1 extends Fragment implements View.OnClickListener {

    Button b_f1;
    EditText ed_f1;
    OnSmthListener smthListener;

    public interface OnSmthListener {
        public void transmitData(String s);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            smthListener = (OnSmthListener) context;
        } catch (Exception e) {
            e.printStackTrace();
            throw new ClassCastException("Activity doesnt support interface OnSmthListener! ");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment1_layout, null);
        b_f1 = (Button) v.findViewById(R.id.button_f1);
        b_f1.setOnClickListener(this);
        ed_f1 = (EditText) v.findViewById(R.id.editText_f1);
        return v;
    }

    @Override
    public void onClick(View v) {
        if (v == b_f1) {
            String s = ed_f1.getText().toString();
            smthListener.transmitData(s);
        }
    }
}
