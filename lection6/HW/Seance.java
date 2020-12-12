package lection6.HW;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Seance {
    private Movie movie;
    private Time startTime;
    private LocalTime endTime;

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;

        String endTimeNew = this.getStartTime() + ":" + movie.getDuration(); // тут не стрінги додавати треба!
        this.endTime = LocalTime.parse(endTimeNew, DateTimeFormatter.ofPattern("HH:mm"));
//    getMovie().getDuration().getNewLocalTime();
//        + movie.getDuration()
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }




}
