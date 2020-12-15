package lection6.HW;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Cinema implements Comparable<Seance> {
    private TreeMap<WeekDays, Schedule> schedule = new TreeMap<>();
    private Time open;
    private Time close;

    public Cinema(Time open, Time close) {
        this.open = open;
        this.close = close;
    }

    public TreeMap<WeekDays, Schedule> getSchedule() {
        return schedule;
    }

    public Time getOpen() {
        return open;
    }

    public Time getClose() {
        return close;
    }

    public void addSeance(String day, Seance seance) {
        for (WeekDays value : WeekDays.values()) {
            if (day.equals(value.toString())) {
                System.out.println("Знайдено " + value);
                System.out.println(seance.getStartTime().getNewLocalTime() + " Початок сеансу");
                if (getOpen().getNewLocalTime().getHour() <= seance.getStartTime().getHour()) {
                    System.out.println("Час сеансу дозволений");
                    schedule.put(WeekDays.MONDAY, new Schedule(new TreeSet<>()));
                    System.out.println(schedule.values());

//                    Set<Seance> seanceSet = new TreeSet<>();
//                    Schedule schedule1 = new Schedule(seanceSet);

//                    Set<Seance> seanceSet = new TreeSet<>();
//                    Schedule schedule1 = new Schedule();
//                getSchedule().put(value, seanceSet)
//                    TreeMap<WeekDays, Schedule> schedule = new TreeMap<>();
//                    schedule1.getSeanceSet()
//                    schedule.put(value, new Schedule());

                } else {
                    System.out.println("Час сеансу НЕ дозволений, бо cinema працює із "
                            + getOpen().getNewLocalTime().getHour() + "год");
                }
            }
        }
    }

    @Override
    public int compareTo(Seance seance) {
        return 0;
    }
}
