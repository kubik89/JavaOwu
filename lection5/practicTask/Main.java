package lection5.practicTask;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Dog1", 5);
        Pet pet2 = new Pet("Cat1", 2);

//        List<Pet> pets = new ArrayList<>();
//        pets.add(pet1);
//        pets.add(pet2);

//        System.out.println(pets);

        Person p1 = new Person(1, "Person1", 25);
        Person p2 = new Person(2, "Person2", 40);

        Map<Person, List<Pet>> map = new HashMap<>();
        map.put(p1, new ArrayList<>());
        map.put(p2, new ArrayList<>());

        ZooClub zooClub1 = new ZooClub(map);

//        zooClub1.setClub(map);

//        System.out.println(zooClub1.getClub());
        addParticipantInClub(1, pet1, map);
        addParticipantInClub(2, pet2, map);
        printMap(map);
    }

    public static void addParticipantInClub(int personId, Pet pet, Map<Person, List<Pet>> map) {
        Set<Person> set = map.keySet(); // пробігаюсь по ключах мапи
        for (Person newSet : set) {
            if (newSet.getId() == personId) {
//                System.out.println(newSet.getName());
                map.get(newSet).add(pet);
//                System.out.println(map);
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

