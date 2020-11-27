package folder1;

public class User {
    long id;
    String login;
    String password;
    byte age;
    String sex;
    float weight;
    double height;
    boolean isActive;
    char specialSymbol;

    public User() {
    }

    public User(long id, String login, byte age) {
        this.id = id;
        this.login = login;
        this.age = age;
    }

    public User(long id, String login, String password, byte age, String sex, float weight, double height, boolean isActive, char specialSymbol) {

        this.id = id;
        this.login = login;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
        this.isActive = isActive;
        this.specialSymbol = specialSymbol;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if (id < 10) {
            System.out.println("less than 10");
        } else {
            this.id = id;
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public char getSpecialSymbol() {
        return specialSymbol;
    }

    public void setSpecialSymbol(char specialSymbol) {
        this.specialSymbol = specialSymbol;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", isActive=" + isActive +
                ", specialSymbol=" + specialSymbol +
                '}';
    }

    public String greetings(String msg) {
        String grt = "Hello. My name is " + this.login + ". I'm " + this.age + " years old.";
        return grt;
    }
}
