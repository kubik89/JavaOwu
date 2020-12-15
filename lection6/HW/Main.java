package lection6.HW;

import lection6.CW.Person;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(10, 5);
        Time time2 = new Time(12, 26);
        Time time3 = new Time(1, 45);
        Time open1 = new Time(10, 0);
        Time close1 = new Time(23, 59);
//        System.out.println(time1.getNewLocalTime());

//        time1.setNewLocalTime(time1.getNewLocalTime().plusHours(12));
//        System.out.println(time1.getNewLocalTime());

        Movie movie1 = new Movie("Movie1", new Time(10, 22));
        Movie movie2 = new Movie("Movie2", new Time(16, 10));
        Movie movie3 = new Movie("Movie3", new Time(22, 15));

        Seance seance1 = new Seance(movie1, time1);
        Seance seance2 = new Seance(movie2, time2);
        Seance seance3 = new Seance(movie3, time3);
//        System.out.println(seance1.getEndTime());

//        Set<Seance> seanceSet = new TreeSet<>();

        Schedule schedules = new Schedule();
        schedules.addSeanceForSchedule(movie1, time1);
        schedules.addSeanceForSchedule(movie2, time2);
        schedules.addSeanceForSchedule(movie3, time3);
        System.out.println(schedules.getSeanceSet());

        schedules.removeSeanceFromShedule("Movie2");
        System.out.println(schedules.getSeanceSet());
//
        Cinema cinema1 = new Cinema(open1, close1);
        cinema1.addSeanceForCinema("FRIDAY", seance1);
        cinema1.addSeanceForCinema("MONDAY", seance2);
//        cinema1.addSeances("MONDAY", new Seance(movie1, time1));

//        System.out.println("Стартую планування");
        cinema1.removeMovie("Movie2");

        System.out.println(schedules.getSeanceSet());


//        TreeMap<WeekDays, Schedule> schedule = new TreeMap<>();
//        schedule.put(WeekDays.MONDAY, schedules);
//        schedule.put(WeekDays.TUESDAY, schedules);
//        System.out.println(schedule);


    }
}
