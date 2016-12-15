package com.example.sbmt.fragmentdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment1 extends Fragment implements View.OnClickListener {

    Button btn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_1_layout, null);
        btn = (Button) v.findViewById(R.id.button_hello_fragment);
        btn.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        if (v==btn) {
            Button act_button = (Button) getActivity().findViewById(R.id.button_hello);
            act_button.setText("hello from fragment");
        }
    }
}
