package lesson8.HW;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ReadWrite readWrite = new ReadWrite();
        readWrite.writeToFile();
        readWrite.readFromFile();

        Person p1 = new Person(1, "Person1", 25);
        Person p2 = new Person(2, "Person2", 40);
        Person p3 = new Person(3, "Person3", 50);

        Map<Person, List<Pet>> map = new HashMap<>();
        map.put(p1, new ArrayList<>());
        map.put(p2, new ArrayList<>());

        addParticipantInClub(p3, map);
        addAnimalForParticipant(1, readWrite.getPetByName("Animal2"), map);
        addAnimalForParticipant(2, readWrite.getPetByName("Animal3"), map);
        addAnimalForParticipant(3, readWrite.getPetByName("Animal4"), map);
        removeAnimalFromParticipant(2, map);
        deleteParticipantFromClub(2, map);
        deleteSomeAnimalFromAllParticipants(2, "Cat1", map);

        printMap(map);
    }

    public static void addAnimalForParticipant(int personId, Pet pet, Map<Person, List<Pet>> map) {
        Set<Person> set = map.keySet();
        for (Person newSet : set) {
            if (newSet.getId() == personId) {
                map.get(newSet).add(pet);
            }
        }
    }

    public static void addParticipantInClub(Person person, Map<Person, List<Pet>> map) {
        map.put(new Person(person.getId(), person.name, person.getAge()), new ArrayList<>());
    }

    public static void removeAnimalFromParticipant(int personId, Map<Person, List<Pet>> map) {
        Set<Person> people = map.keySet();
        for (Person person : people) {
            if (person.getId() == personId) {
                for (int i = 0; i < map.get(person).size(); i++) {
                    map.get(person).clear(); // видаляю обєкт який міститься в ключі Person, а це тварина
                }
            }
        }
    }

    public static void deleteParticipantFromClub(int personId, Map<Person, List<Pet>> map) {
        Set<Person> people = map.keySet();
        people.removeIf(person -> person.getId() == personId);
    }

    public static void deleteSomeAnimalFromAllParticipants(int petAge, String petName, Map<Person, List<Pet>> map) {
        Set<Person> people = map.keySet();
        for (Person person : people) {
            for (int i = 0; i < map.get(person).size(); i++) {
                if (map.get(person).contains(new Pet(petName, petAge))) {
                    map.get(person).clear();
                }
            }
        }
    }

    public static void printMap(Map<Person, List<Pet>> map) {
        Set<Map.Entry<Person, List<Pet>>> entries = map.entrySet();
        for (Map.Entry<Person, List<Pet>> entry : entries) {
            System.out.println(entry.getKey() + ": ");
            for (Pet pet : entry.getValue()) {
                System.out.println("\t" + pet);
            }
        }
    }

}

