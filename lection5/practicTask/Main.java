package lection5.practicTask;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Dog1", 5);
        Pet pet2 = new Pet("Cat1", 2);

        Person p1 = new Person(1, "Person1", 25);
        Person p2 = new Person(2, "Person2", 40);
        Person p3 = new Person(3, "Person3", 50);

        Map<Person, List<Pet>> map = new HashMap<>();
        map.put(p1, new ArrayList<>());
        map.put(p2, new ArrayList<>());

        addParticipantInClub(p3, map);
        addAnimalForParticipant(1, pet1, map);
        addAnimalForParticipant(2, pet2, map);
        removeAnimalFromParticipant(2, map);

        deleteParticipantFromClub(1, map);

        printMap(map);

        ZooClub zooClub1 = new ZooClub(map);

//        System.out.println(zooClub1.getClub());
    }

    public static void addAnimalForParticipant(int personId, Pet pet, Map<Person, List<Pet>> map) {
        Set<Person> set = map.keySet(); // пробігаюсь по ключах мапи
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
//            System.out.println(person);
            if (person.getId() == personId) {
//                System.out.println(map.get(person)); // Отримую тварину, тут person є ключем, а метод шукає по ключу
                for (int i = 0; i < map.get(person).size(); i++) {
                    map.get(person).clear(); // видаляю обєкт який міститься в ключі Person, а це тварина
                }
            }
        }
    }

    public static void deleteParticipantFromClub(int personId, Map<Person, List<Pet>> map) {
        Set<Person> people = map.keySet();
        for (Person person : people) {
            if (person.getId() == personId) {
                System.out.println("Знайдено - " + person);

            }
        }
    }
//        }
//    }

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

