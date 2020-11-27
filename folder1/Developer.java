package folder1;

import java.util.ArrayList;

public class Developer {
    String name;
    private ArrayList<String> skills = new ArrayList<>();

    public Developer() {
    }

    public Developer(String name, ArrayList<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", skills=" + skills +
                '}';
    }

    public void work () {
        System.out.println("Go to work");
    }
    public void work (String work1) {
        System.out.println("Go to work because " + work1);
    }

    public void work (int money) {
        System.out.println("You earn " + money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }
}
