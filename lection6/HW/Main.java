package lection6.HW;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(12, 11);
        System.out.println(time1.getNewLocalTime());

        time1.setNewLocalTime(time1.getNewLocalTime().plusHours(12));
        System.out.println(time1.getNewLocalTime());

        Movie movie1 = new Movie("Movie1", new Time(10, 22));
        Movie movie2 = new Movie("Movie2", new Time(16, 10));
//
        Seance seance1 = new Seance(movie1, time1);
        System.out.println(seance1.getEndTime());


    }
}
