package lection4.practiceTask;

public enum Seasons implements SeasonMethods {
    WINTER(-10), SPRING(15), SUMMER(25) {
        @Override
        public void getDescription() {
            System.out.println("Тепла пора року");
        }
    }, AUTUMN(10);

    private int temperature;

    Seasons(int temperature) {
        this.temperature = temperature;
    }

    public int getTempreture() {
        return temperature;
    }

    public void aboutMySeason(String season) {
        System.out.println("I like " + season + ". Temperature at this time is near " + getTempreture() + " degrease.");
        getDescription();
    }

    @Override
    public String toString() {
        return "Seasons{" +
                "tempreture=" + temperature +
                '}';
    }
}
