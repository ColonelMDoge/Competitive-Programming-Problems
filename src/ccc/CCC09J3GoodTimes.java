package ccc;

import java.time.LocalTime;
import java.util.Scanner;

public class CCC09J3GoodTimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String timeString = input.nextLine();
        StringBuilder stringBuilder = new StringBuilder("0".repeat(Math.max(0, 4 - timeString.length())) + timeString).insert(2,":");
        LocalTime time = LocalTime.parse(stringBuilder);
        System.out.println(cullZeroes(time.toString().replace(":","")) + " in Ottawa");
        System.out.println(cullZeroes(time.minusMinutes(180).toString().replace(":","") )+ " in Victoria");
        System.out.println(cullZeroes(time.minusMinutes(120).toString().replace(":","")) + " in Edmonton");
        System.out.println(cullZeroes(time.minusMinutes(60).toString().replace(":","") )+ " in Winnipeg");
        System.out.println(cullZeroes(time.toString().replace(":","") + " in Toronto"));
        System.out.println(cullZeroes(time.plusMinutes(60).toString().replace(":", "") )+ " in Halifax");
        System.out.println(cullZeroes(time.plusMinutes(90).toString().replace(":","")) + " in St. John's");
    }
    public static String cullZeroes(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (Integer.parseInt(String.valueOf(string.charAt(i))) != 0) return string.substring(i);
        }
        return "0";
    }
}
