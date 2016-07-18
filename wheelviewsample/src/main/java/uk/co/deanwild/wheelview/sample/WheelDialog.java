package uk.co.deanwild.wheelview.sample;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import uk.co.deanwild.wheelview.WheelView;

/**
 * Created by deanwild on 23/06/16.
 */
public class WheelDialog extends AlertDialog {


    WheelView pickerDay;
    WheelView pickerMonth;
    WheelView pickerYear;

    public WheelDialog(Context context) {
        super(context);
        init();
    }

    void init() {
        final Context themeContext = getContext();
        final LayoutInflater inflater = LayoutInflater.from(themeContext);
        final View view = inflater.inflate(R.layout.dialog_example, null);
        setView(view);

        pickerDay = (WheelView) view.findViewById(R.id.picker_day);
        pickerMonth = (WheelView) view.findViewById(R.id.picker_month);
        pickerYear = (WheelView) view.findViewById(R.id.picker_year);

        List<String> days = new ArrayList<>();
        days.add(" - ");

        for (int day = 1; day <= 31; day++) {
            days.add(String.valueOf(day));
        }

        pickerDay.setItems(days, null);


        List<String> months = new ArrayList<>();
        months.add(" - ");

        for (int month = 1; month <= 12; month++) {
            months.add(String.valueOf(month));
        }

        pickerMonth.setItems(months, null);


        List<String> years = new ArrayList<>();
        years.add(" - ");

        for (int year = 2016; year > 1900; year--) {
            years.add(String.valueOf(year));
        }

        pickerYear.setItems(years, null);


    }


    @Override
    public void dismiss() {
        super.dismiss();
        String test1 = pickerYear.getSelectedItem();
        String test2 = pickerMonth.getSelectedItem();
        String test3 = pickerDay.getSelectedItem();
    }
}
