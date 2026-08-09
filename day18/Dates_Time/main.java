package day18.Dates_Time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class main {
    static void main(String[] args) {

        //(LocalDate, Localtime, LocalDateTime, UTC timestamp)

        //localDAte
//        LocalDate Date = LocalDate.now();
//        //LocalTime
//        LocalTime Time = LocalTime.now();
//        //LocalDateTime
//        LocalDateTime dateTime = LocalDateTime.now();
//        //UTC timestamp
//        Instant instant = Instant.now();
//
//
//        System.out.println(Date);
//        System.out.println(Time);
//        System.out.println(dateTime);
//        System.out.println(instant);

        //Custom format

        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

    }
}
