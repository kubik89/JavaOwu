package lection6.HW;

public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(10, 5);
        Time time2 = new Time(12, 26);
        Time time3 = new Time(15, 45);
        Time open1 = new Time(10, 0);
        Time close1 = new Time(23, 59);

        Movie movie1 = new Movie("Movie1", new Time(10, 22));
        Movie movie2 = new Movie("Movie2", new Time(16, 10));
        Movie movie3 = new Movie("Movie3", new Time(22, 15));

        Seance seance1 = new Seance(movie1, time1);
        Seance seance2 = new Seance(movie2, time2);
        Seance seance3 = new Seance(movie3, time3);

        Cinema cinema1 = new Cinema(open1, close1);
        cinema1.addSeanceForCinema("FRIDAY", seance1);
        cinema1.addSeanceForCinema("MONDAY", seance2);
        cinema1.addSeanceForCinema("TUESDAY", seance3);
        cinema1.addSeanceForCinema("SUNDAY", seance2);

        cinema1.removeMovie("Movie2");

        cinema1.removeMovieAtDay("Movie1", WeekDays.FRIDAY);

        System.out.println(cinema1.getSchedule());

    }
}
