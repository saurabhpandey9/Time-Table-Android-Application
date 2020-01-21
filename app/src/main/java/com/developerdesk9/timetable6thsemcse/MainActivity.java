package com.developerdesk9.timetable6thsemcse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private TextView dateTimeDisplay;
    private Calendar calendar;
    private SimpleDateFormat dateFormat;
    private String date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dateTimeDisplay = (TextView)findViewById(R.id.textView);
        calendar = Calendar.getInstance();

        dateFormat = new SimpleDateFormat("EEEE \n d MMM, yyyy");
        date = dateFormat.format(calendar.getTime());
        dateTimeDisplay.setText(date);


    }
}
