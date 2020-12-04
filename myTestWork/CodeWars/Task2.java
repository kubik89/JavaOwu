package myTestWork.CodeWars;

public class Task2 {
    public static String warnTheSheep(String[] array) {


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("wolf")) {
                if (i == array.length - 1) {
                    sb.append("Pls go away and stop eating my sheep");
                    return sb.toString().trim();

                } else {
                    int neededSheep = array.length - 1 - i;
                    sb.append("Oi! Sheep number " + neededSheep + "! You are about to be eaten by a wolf!");
                    return sb.toString().trim();
                }
            }
        }
        return sb.toString().trim();
    }
}
