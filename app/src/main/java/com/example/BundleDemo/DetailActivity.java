package com.example.BundleDemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.BundleDemo.model.Reminder;

public class DetailActivity extends AppCompatActivity {
    private Reminder reminder;
    private TextView tv_note, time, priority;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        init();
        //TODO get a bundle object passed from the reminder adapter
        Bundle b = getIntent().getBundleExtra(ReminderAdapter.RBUNDLE);
        if (b != null) {
            //create a new reminder object with from this bundle
            reminder = new Reminder(b);
        }
        display();
    }

    private void init() {
        tv_note = findViewById(R.id.tv_note_content);
        time = findViewById(R.id.time_content);
        priority = findViewById(R.id.tv_priority_content);
    }

    private void display() {
        //TODO: display values on fields
        tv_note.setText(reminder.getTittle());
        time.setText(reminder.getTime());
        priority.setText(reminder.getPriority());
    }
}
