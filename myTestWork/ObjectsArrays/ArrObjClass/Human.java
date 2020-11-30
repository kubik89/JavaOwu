package myTestWork.ObjectsArrays.ArrObjClass;

public class Human {
    private String name;
    private int age1;
    private boolean married;

    public Human(){}

    public Human(String name, int age, boolean married){
        this.name = name; this.age1 = age; this.married = married;
    }

    public void wouldHaveChilds(boolean isMarried) {
        if (isMarried) {
            System.out.println("Я одружений, тому можу мати дітей");
        } else
            System.out.println("Я не можу мати дітей");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age1;
    }

    public void setAge(int age) {
        this.age1 = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
