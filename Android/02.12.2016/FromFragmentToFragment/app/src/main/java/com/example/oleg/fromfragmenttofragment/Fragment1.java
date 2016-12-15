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

/**
 * Created by Oleg on 01.12.16.
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
        } catch (ClassCastException e) {
            e.printStackTrace();
            throw new ClassCastException("Активити не поддерживает интерфейс OnSmthListener");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment1_layout, null);
        b_f1 = (Button) v.findViewById(R.id.button_F1);
		b_f1.setOnClickListener(this);
        ed_f1 = (EditText) v.findViewById(R.id.editText_F1);
        return v;
    }


    @Override
    public void onClick(View view) {
        if (view == b_f1) {
            String s = ed_f1.getText().toString();
            smthListener.transmitData(s);
        }
    }
}
