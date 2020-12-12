package lection6.HW;

import java.time.Duration;
import java.time.LocalDate;

public class Seance {
    private Movie movie;
    private Duration startTime;
    private Duration endTime;

//    Duration movie = LocalDate.of(year, month, dayOfMonth);

    public Seance(Movie movie, Duration startTime) {
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = this.startTime.plus(movie.getDuration());

    }
}
