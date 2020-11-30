package myTestWork.ObjectsArrays.ArrObjClass;

public class Worker extends Human {


    public Worker() {}
    public Worker(String name, int age, boolean married) {
        super(name, age, married);
    }
    public void canWork() {
        System.out.println("I can work");
    }
}
