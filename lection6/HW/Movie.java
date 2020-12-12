package lection6.HW;

import java.time.Duration;

public class Movie implements Comparable<Duration>{
    private String title;
    private Duration duration;

    public Movie() {};

    public Movie(String title, Duration duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public int compareTo(Duration duration) {
        return 0;
    }
}
