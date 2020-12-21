package lesson8.HW;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        File animals = new File("animals.txt");
//        List<ZooClub> zooClubList = new ArrayList<>();
        ZooClub zooClub1 = new ZooClub();

        try (FileOutputStream toFile = new FileOutputStream(animals)) {
            toFile.write("Animal1,5,brown\n".getBytes());
            toFile.write("Animal2,6,black\n".getBytes());
            toFile.write("Animffal3,7,white\n".getBytes());
            toFile.write("Animal4,8,orange\n".getBytes());
            toFile.write("Animal5,9,silver\n".getBytes());
            toFile.write("Animal6,10,yellow\n".getBytes());
            toFile.write("Animal7,11,green\n".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader fromFile = new BufferedReader(new FileReader(animals))) {
            String i;
            while ((i = fromFile.readLine()) != null) {
                String animalName = i.substring(0, i.indexOf(44));
                String part2 = i.substring(i.indexOf(44) + 1);
                String animalAge = part2.substring(0, part2.indexOf(44));
                String part3 = i.substring(i.indexOf(44) + part2.indexOf(44) + 2);

//                zooClubList.add(new ZooClub(animalName, Integer.parseInt(animalAge), part3));
                ZooClub zooClub = new ZooClub(animalName, Integer.parseInt(animalAge), part3);
                System.out.println(zooClub);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
