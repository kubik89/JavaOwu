package folder1;

import java.util.ArrayList;

public class SuperDev extends Developer{
    String myName;

    public SuperDev() {
    }

    public SuperDev(String myName) {
        this.myName = myName;
    }

    public SuperDev(String name, ArrayList<String> skills, String myName) {
        super(name, skills);
        this.myName = myName;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }
}
