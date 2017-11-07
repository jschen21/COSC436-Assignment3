package edu.towson.cosc.cosc436.assignment3.jchen21;

/**
 * Created by jchen21 on 10/26/2017.
 */
public class ReceiptDate{
    private int month;
    private int day;
    private int year;

    public ReceiptDate(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }
    public String toString(){
        return (month + " " + day + ", " + year);
    }
}