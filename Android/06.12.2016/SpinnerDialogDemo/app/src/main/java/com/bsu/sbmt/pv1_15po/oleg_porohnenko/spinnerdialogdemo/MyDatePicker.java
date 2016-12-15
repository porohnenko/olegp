package com.bsu.sbmt.pv1_15po.oleg_porohnenko.spinnerdialogdemo;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;

/**
 * Created by Oleg on 06.12.16.
 */

public class MyDatePicker extends DialogFragment implements DatePickerDialog.OnDateSetListener {
    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        MainActivity.tv.setText(year + "-" + month + "-" + dayOfMonth);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        Calendar c = Calendar.getInstance();
        DatePickerDialog dp = new DatePickerDialog(getActivity(), this, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));

        dp.getDatePicker().setCalendarViewShown(true);
        dp.getDatePicker().setSpinnersShown(false);

        return dp;
    }
}
