package lection4.practiceTask;

public class Main {
    public static void main(String[] args) {
        for (Seasons season : Seasons.values()) {
            System.out.println("Пора року: " + season.name() + ", " + "Середня температура: " + season.getTempreture());
            season.getDescription();
        }

        Seasons mySeas = Seasons.SUMMER;
        mySeas.aboutMySeason(mySeas.name());
    }
}
