package com.example.java;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {

        LocalDateTime lastFullMoon = LocalDateTime.of(2017,1,12,4,35,12);
        LocalDateTime todayDate = LocalDateTime.now(); //gets the time and date of right now
        System.out.println("Todays date and time now is: " + todayDate);
        LocalDateTime nextFullMoon = lastFullMoon; // reset the fullMoon date
        while(nextFullMoon.isBefore(todayDate)){        //add the amount of days hours and minutes until the next full moon
            int daysBetween = 29;
            int hoursBetween = 12;
            int minutesBetween = 44;
            nextFullMoon = nextFullMoon.plusMinutes(minutesBetween);
            nextFullMoon = nextFullMoon.plusHours(hoursBetween);
            nextFullMoon = nextFullMoon.plusDays(daysBetween);
        }
        System.out.println("The date and time of the next full mooon is: " + nextFullMoon); //print out the date and time of the next full moon

    }
}
