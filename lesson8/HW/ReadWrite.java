package lesson8.HW;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWrite {

    List<ZooClub> zooClubList = new ArrayList<>();
    File animals = new File("animals.txt");

    List<String> animaInfoList = new ArrayList<>();

    {
        animaInfoList.add("Animal1,5,brown\n");
        animaInfoList.add("Animal2,6,black\n");
        animaInfoList.add("Animal3,7,white\n");
        animaInfoList.add("Animal4,8,orange\n");
        animaInfoList.add("Animal5,9,silver\n");
        animaInfoList.add("Animal6,10,yellow\n");
        animaInfoList.add("Animal7,15,blue-white\n");
        animaInfoList.add("Animal8,11,red\n");
        animaInfoList.add("Animal9,16,green\n");
        animaInfoList.add("Animal10,2,green-orange\n");
        animaInfoList.add("Animal11,1,white-black\n");

    }

    public void writeToFile() {

        try (FileOutputStream toFile = new FileOutputStream(animals)) {
            for (String s : animaInfoList) {
                toFile.write(s.getBytes());
            }

        } catch (IOException e) {
            System.out.println("Не стоїть кома в одному із обєктів поля");
            e.printStackTrace();
        }
    }

    public void readFromFile() {
        try (BufferedReader fromFile = new BufferedReader(new FileReader(animals))) {
            String i;
            while ((i = fromFile.readLine()) != null) {
                String[] split = i.split(",");
                String name = split[0];
                String age = split[1];
                String color = split[2];
                zooClubList.add(new ZooClub(name, Integer.parseInt(age), color));
                new ZooClub(name, Integer.parseInt(age), color);
            }

            //   АБО Варіант 2

//                String animalName = i.substring(0, i.indexOf(44));
//                String part2 = i.substring(i.indexOf(44) + 1);
//                String animalAge = part2.substring(0, part2.indexOf(44));
//                String part3 = i.substring(i.indexOf(44) + part2.indexOf(44) + 2);
//
//                zooClubList.add(new ZooClub(animalName, Integer.parseInt(animalAge), part3));
//                new ZooClub(animalName, Integer.parseInt(animalAge), part3);

        } catch (IOException e) {
            e.printStackTrace();
        }
        zooClubList.forEach(System.out::println);
    }
}

