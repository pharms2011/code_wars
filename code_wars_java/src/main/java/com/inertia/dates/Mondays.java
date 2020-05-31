package com.inertia.dates;

//Nobody likes Mondays! You spent the weekend partying and hanging out with friends, and then Monday comes, and you have to get up early, put on some business clothes and go to work. So how many of these horrible days does someone have to endure? Well, let's find out.
//        Create a method to find the number of Mondays given a person's birthday and the current date. For this simple Kata, do not worry about holidays/vacation, sick leave etc.
//        Assume a person has a job and goes to work throughout a year if he/she is of working age. To keep things simple, assume someone starts working when he/she is 22 years old and retires when he/she is 78.
//        That's right, Mondays don't count as bad days if you are at school/university or a pensioner!
//        In the tests, the current date will be the same or after a person's birthday and both dates will be non null and valid. And although not having to work on the weekends is a rather recent fad (look it up!) assume that Mondays where and will always be bad days at any era

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Mondays {
    public static long count(final LocalDate birthday, final LocalDate today) {
        LocalDate endOfParty = birthday.plus(22, ChronoUnit.YEARS);
        LocalDate oldAge = birthday.plus(78, ChronoUnit.YEARS);
        LocalDate afterParty = today.isAfter(oldAge)? oldAge: today;
        Long daysBetween = endOfParty.until(afterParty, ChronoUnit.DAYS);
        // Number of Weeks
        Long mondays = daysBetween/7;
        int endOfPartyDay = endOfParty.getDayOfWeek().getValue();
        int afterPartyDay = afterParty.getDayOfWeek().getValue();
        if(endOfPartyDay ==1){
            mondays++;
        }
        if((endOfParty.getDayOfWeek() == DayOfWeek.SUNDAY && daysBetween%7 >= 1) || ((daysBetween+endOfPartyDay)%7)>1){
            mondays++;
        }
        return daysBetween < 0? 0:mondays;
    }
}
