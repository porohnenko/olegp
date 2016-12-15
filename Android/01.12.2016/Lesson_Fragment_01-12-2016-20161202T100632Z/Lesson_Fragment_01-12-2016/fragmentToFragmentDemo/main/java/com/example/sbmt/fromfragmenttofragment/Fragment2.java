package com.example.sbmt.fromfragmenttofragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fragment2 extends Fragment implements View.OnClickListener  {

    Button b_f2;
    EditText ed_f2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment2_layout, null);
        b_f2 = (Button) v.findViewById(R.id.button_f2);
        b_f2.setOnClickListener(this);
        ed_f2 = (EditText) v.findViewById(R.id.editText_f2);

        return v;
    }

    @Override
    public void onClick(View v) {
        String s = ed_f2.getText().toString();
        TextView txt =(TextView) getActivity().findViewById(R.id.textView);
        txt.setText(s);
    }
}
