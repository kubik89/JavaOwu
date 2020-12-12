package lection6.HW;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
    private int hour;
    private int min;
    private LocalTime newLocalTime;

    public Time(int hour, int min) {
        this.min = min;
        this.hour = hour;
        String localTime1 = this.getHour() + ":" + this.getMin();
        this.newLocalTime = LocalTime.parse(localTime1, DateTimeFormatter.ofPattern("HH:mm"));
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (min >=0 && min <= 23) {
        this.min = min;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >=0 && hour <= 59) {
            this.hour = hour;
        }
    }

    public LocalTime getNewLocalTime() {
        return newLocalTime;
    }

    public void setNewLocalTime(LocalTime newLocalTime) {
        this.newLocalTime = newLocalTime;
    }
}


