package Advance_Java.Date_Time;

import java.util.Date;

public class Date_Time {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);

//        System.currentTimeMillis() // it gives the current time in milliseconds

        Date date = new Date(); // Date is a inBuild class in java 
        System.out.println(date);
    }
}

// java calculate time in milliseconds from 1970
