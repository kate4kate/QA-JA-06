package com.telesens.academy.lesson05.exc;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 1970;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%d", day, month, year);
        // return day + "/" + month + "/" + year;
    }

    // withXXX
    public Date withDay(int day) {
        this.day = day;
        return this;
    }

    public Date withMonth(int month) {
        this.month = month;
        return this;
    }

    public Date withYear(int year) {
        this.year = year;
        return this;
    }
}
