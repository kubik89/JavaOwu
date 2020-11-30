package myTestWork.ObjectsArrays.ArrObjClass;

public class Main {
    public static void main(String[] args) {
        Human hum1 = new Human("Vasyl", 30, false);
        Human hum2 = new Human("Oleg", 35, true);
        Worker worker1 = new Worker("Ivan", 40, true);
//        Worker worker1 = (Worker) hum1;
        Worker worker2 = new Worker("Illja", 50, false);
        Student stud1 = new Student("Natalia", 25, false);
        Student stud2 = new Student("Iryna", 20, true);

        hum1.wouldHaveChilds(hum1.isMarried());
        System.out.println(hum1.getName());

        System.out.println(stud1.getAge());

        //        ((Worker) hum1).canWork();

    }
}
