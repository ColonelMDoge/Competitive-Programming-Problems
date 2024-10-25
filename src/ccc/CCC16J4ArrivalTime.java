package ccc;

import java.time.LocalTime;
import java.util.Scanner;
public class CCC16J4ArrivalTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalTime time = LocalTime.parse(input.next());
        int minutes = time.getHour() * 60 + time.getMinute();
        int distance = 240;
        while (true) {
            if ((minutes >= 420 && minutes <= 600) || (minutes >= 900 && minutes <= 1140)) {
                distance--;
            } else distance -= 2;
            if (distance < 0) break;
            minutes = (minutes + 1) % 1440;
        }
        System.out.println(LocalTime.of(minutes / 60, minutes % 60));
    }
}
