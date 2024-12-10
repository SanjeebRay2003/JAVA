package Advance_Java.Collection_Framework.Sets.Enum_Set;

import java.sql.SQLOutput;
import java.util.EnumSet;
import java.util.Iterator;

enum Days{
   SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class enum_set {
    public static void main(String[] args) {

        EnumSet<Days> days = EnumSet.allOf(Days.class); // It takes all the constants of enum class
//        EnumSet<Days> days = EnumSet.range(Days.MONDAY,Days.FRIDAY); // It takes all the constants of enum class between this range
//        EnumSet<Days> days = EnumSet.of(Days.SUNDAY,Days.TUESDAY); // It takes the specific given constants

//        days.add(Days.FRIDAY); // adds the another given constant

        System.out.println("All days of a week : \n" + days);
        days.remove(Days.MONDAY);

        System.out.println("Accessing the days of a week :");
        for (Days d: days){ // To access the Days
            System.out.print(d + ",");
        }

//        // Iterator for access the Days
//        Iterator<Days> iterator = days.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

    }
}

/* It is important to insert enum elements in EnumSet that
    every insertable elements are present in enum class
 */
