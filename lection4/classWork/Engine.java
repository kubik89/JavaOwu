package lection4.classWork;

public class Engine {
    private int volume;
    private int cylinderQty;

    public Engine() {
    }

    public Engine(int volume, int cylinderQty) {
        this.volume = volume;
        this.cylinderQty = cylinderQty;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCylinderQty() {
        return cylinderQty;
    }

    public void setCylinderQty(int cylinderQty) {
        this.cylinderQty = cylinderQty;
    }

    public void startEngine() {
        System.out.println("Start engine");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", cylinderQty=" + cylinderQty +
                '}';
    }
}
