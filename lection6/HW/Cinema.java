package lection6.HW;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Cinema implements Comparable<Seance> {
    private TreeMap<WeekDays, Seance> schedule = new TreeMap<>();
    private Time open;
    private Time close;

    public Cinema(Time open, Time close) {
        this.open = open;
        this.close = close;
    }

    public TreeMap<WeekDays, Seance> getSchedule() {
        return schedule;
    }

    public Time getOpen() {
        return open;
    }

    public Time getClose() {
        return close;
    }

    public void addSeanceForCinema(String day, Seance seance) {
        for (WeekDays value : WeekDays.values()) {
            if (day.equals(value.toString())) {
                System.out.println("Знайдено " + value);
                System.out.println(seance.getStartTime().getNewLocalTime() + " Початок сеансу");
                if (getOpen().getNewLocalTime().getHour() <= seance.getStartTime().getHour()) {
                    System.out.println("Час сеансу дозволений");
                    System.out.println(getSchedule().values());
                    Schedule schedule1 = new Schedule();
                    schedule.put(value, schedule1.addSeanceForSchedule(seance.getMovie(), seance.getStartTime()));
                    System.out.println(schedule.values());

                } else {
                    System.out.println("Час сеансу НЕ дозволений, бо cinema працює із "
                            + getOpen().getNewLocalTime().getHour() + "год");
                }
            }
        }
    }

    //    (повністю видаляє усі сеанси вказаного фільму з розкладу)
    public void removeMovie(String title) {
        schedule.values().removeIf(value -> value.getMovie().getTitle().equals(title));
    }

//    видаляє конкретний сеанс фільму в конкретний день, який задається параметром
    public void removeMovieAtDay(String title, WeekDays days) {
        System.out.println(schedule.values());
        for (Seance value : schedule.values()) {
            if (value.getMovie().getTitle().equals(title)) {
                if (schedule.containsKey(days)) {
                    schedule.values().remove(schedule.get(days));
                }
            }
        }

    }

    @Override
    public int compareTo(Seance seance) {
        if (this.getOpen().getHour() != seance.getStartTime().getHour()) {
            return 1;
        } else return 0;
    }
}
