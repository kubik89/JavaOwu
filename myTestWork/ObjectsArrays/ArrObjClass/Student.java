package myTestWork.ObjectsArrays.ArrObjClass;

public class Student extends Human {

    public Student() {}
    public Student(String name, int age, boolean married) {
        super(name, age, married);
    }

    public void restTeachingTime(int myAge) {
        System.out.println(getAge() - myAge);
    }

}
