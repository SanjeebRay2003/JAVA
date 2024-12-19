package Advance_Java.Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Date_Time {
    public static void main(String[] args) {

        System.out.println("Years since 1970 : "+System.currentTimeMillis()/1000/3600/24/365);

//        System.currentTimeMillis() // it gives the current time in milliseconds

        Date date = new Date(); // Date is a inBuild class in java 
        System.out.println(date);

        LocalDate localDate = LocalDate.now();
        System.out.println("Date : "+localDate);

        LocalTime time = LocalTime.now();
        System.out.println("Time : "+time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date and Time : "+dateTime);
    }
}

// java calculate time in milliseconds from 1970
