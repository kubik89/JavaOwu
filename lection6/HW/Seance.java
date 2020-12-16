package lection6.HW;

import java.time.LocalTime;

public class Seance implements Comparable<Seance> {
    private Movie movie;
    private Time startTime;
    private LocalTime endTime;


    public Seance() {};

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = this.getStartTime().getNewLocalTime().plusHours(movie.getDuration().getNewLocalTime().getHour())
                .plusMinutes(movie.getDuration().getNewLocalTime().getMinute());
    }

    public Movie getMovie() {
        return movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    @Override
    public String toString() {
        return "Seance{" +
                "movie=" + movie +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    @Override
    public int compareTo(Seance seance) {
        int compareHour = this.getStartTime().getHour()-seance.getStartTime().getHour();
        int compareMin = this.getStartTime().getMin()-seance.getStartTime().getMin();
        if (compareHour != 0 && compareMin != 0) {
            return compareHour;
        }
        return 0;
    }
}
