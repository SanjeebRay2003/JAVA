package Advance_Java.Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date_Time_Formatter {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss"); // creating custom pattern for date and time
        String myDate = dateTime.format(date); // format dateTime into date
        System.out.println(myDate);
    }
}
