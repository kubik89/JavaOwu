package myTestWork.CodeWars;

public class Task2 {
    public static void main(String[] args) {
        String[] x = new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < x.length; i++) {
            if (x[i].equals("wolf")) {
                int neededSheep = x.length - 1 - i;
                sb.append("Oi! Sheep number" + neededSheep + "! You are about to be eaten by a wolf!");
            }
        }
        sb.toString().trim();
        System.out.println(sb);
    }
    }
