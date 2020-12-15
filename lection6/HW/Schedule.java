package lection6.HW;

import java.util.Set;
import java.util.TreeSet;

public class Schedule {
    private Set<Seance> seanceSet = new TreeSet<>();

//    public Schedule(Set<Seance> seanceSet) {
//        new TreeSet<Seance>();
//        this.seanceSet = seanceSet;
//    }

    public Set<Seance> getSeanceSet() {
        return seanceSet;
    }

    public void addSeanceForSchedule(Movie movie, Time startTime) {
        seanceSet.add(new Seance(movie, startTime));
//        System.out.println(getSeanceSet());
//        for (Seance seance : getSeanceSet()) {
//            System.out.println(seance.getMovie().getTitle());
//        }
    }

    public void removeSeanceFromShedule(String seanceTitle) {
        getSeanceSet().removeIf(seance -> seance.getMovie().getTitle().equals(seanceTitle));

    }

    @Override
    public String toString() {
        return "Schedule{" +
                "seanceSet=" + seanceSet +
                '}';
    }
}
