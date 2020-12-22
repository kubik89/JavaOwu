package lesson8.HW;

import java.util.Objects;

public class Pet {
    String petName;
    int petAge;

    public Pet() {}

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

    public int getPetAge() {
        return petAge;
    }


}
