package lesson8.CW;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        int a = 4;
//        int arr[] = new int[5];
//        try {
//        System.out.println(arr[a]);
//
//        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//            System.out.println("Це помилка ArrayIndexOutOfBoundsException");
//        }

        try {
        myMethod();
        } catch (MyException e) {
            System.out.println(e.getDetailedMessage());
        }

        File file = new File("1.txt");
//        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) { // файл створився тут, бо потік створився
        try (FileOutputStream fileOutputStream = new FileOutputStream(file, true)) {
            fileOutputStream.write("Hello world".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try (FileInputStream fileInputStream = new FileInputStream(file)) {
//            int i = 0;
//            while ((i = fileInputStream.read()) != -1) {
//                System.out.println((char) i);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file, true))) {
            printWriter.println("PrintWriter... ");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
//            String s;
//            while ((s = bufferedReader.readLine()) != null) {
//                System.out.println(s);
//            }
//            або через forEach
            bufferedReader.lines().forEach(s -> System.out.println(s));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void myMethod() {
        List<String> list = new ArrayList<>();
        if (list.isEmpty()) {
            throw new MyException("List is empty", "I do not like empty lists");
        }
    }


}
