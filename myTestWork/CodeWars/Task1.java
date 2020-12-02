package myTestWork.CodeWars;

import java.util.Arrays;

public class Task1 {
    public static boolean setAlarm(boolean employed, boolean vacation) {
        if (employed && vacation) {
            return false;
        }
        else if (!employed && !vacation) {
            return false;
        }
        else if (!employed && vacation) {
            return false;
        }
        else
            return true;
    }
}

