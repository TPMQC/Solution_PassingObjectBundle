package com.example.BundleDemo.model;

import android.os.Bundle;

public class Reminder {
    private String tittle;
    private String priority;
    private String time;
    //Todo create constants fields
    private static final String PRIORITY_KEY = "PRIORITY_KEY";
    private static final String TITLE_KEY = "title_key";
    private static final String TIME_KEY = "time_key";

    public Reminder() {
    }

    public Reminder(String tittle, String priority, String remindDate) {
        this.tittle = tittle;
        this.priority = priority;
        this.time = remindDate;
    }

    //Todo: Create a constructor which takes in a bundle
    public Reminder(Bundle bundle) {
        this.tittle = bundle.getString(TITLE_KEY);
        this.priority = bundle.getString(PRIORITY_KEY);
        this.time = bundle.getString(TIME_KEY);
    }

    public String getTittle() {
        return tittle;
    }

    public void setTitle(String tittle) {
        this.tittle = tittle;
    }

    public String getpriority() {
        return priority;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    //TODO: implment toBundle method which bundle a reminder object
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(TITLE_KEY, tittle);
        bundle.putString(PRIORITY_KEY, priority);
        bundle.putString(TIME_KEY, time);
        return bundle;
    }
}
