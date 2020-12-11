package lection5.practicTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pet {
    String petName;
    int petAge;


    public Pet(String petName, int petAge) {
        this.petName = petName;
        this.petAge = petAge;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return petAge == pet.petAge &&
                Objects.equals(petName, pet.petName);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petName='" + petName + '\'' +
                ", petAge=" + petAge +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(petName, petAge);
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }
}
