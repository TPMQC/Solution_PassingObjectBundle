package com.example.BundleDemo;

import com.example.BundleDemo.model.Reminder;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    public static List<Reminder> getSampleData() {
        List<Reminder> reminders = new ArrayList<>();
        reminders.add(new Reminder("Pay tution fee for Spring 2019", "High", "As soon as possible"));
        reminders.add(new Reminder("Submit project 1", "Low", "Tonight Feb 14"));
        reminders.add(new Reminder("Take medicine", "Medium", "9pm tonight"));
        reminders.add(new Reminder("Go to gym and work on legs", "medium", "After midterm"));
        reminders.add(new Reminder("Do codepath assignments", "Medium", "Weekends"));
        reminders.add(new Reminder("Do codepath labs", "High", "Weekends"));
        reminders.add(new Reminder("Go to party", "Low", "Weekends"));
        reminders.add(new Reminder("Sleep all day next day", "High", "Next day of the party"));
        reminders.add(new Reminder("Block her instagram", "High", "As soon as possible"));
        reminders.add(new Reminder("Submit project 1", "Low", "Tonight Feb 14"));
        reminders.add(new Reminder("Take medicine", "Medium", "9pm tonight"));
        reminders.add(new Reminder("Go to gym and work on legs", "medium", "After midterm"));
        reminders.add(new Reminder("Do codepath assignments", "Medium", "Weekends"));
        reminders.add(new Reminder("Do codepath labs", "High", "Weekends"));
        reminders.add(new Reminder("Go to party", "Low", "Weekends"));
        reminders.add(new Reminder("Sleep all day next day", "High", "Next day of the party"));
        return reminders;
    }
}
