package ccc;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CCC20S1SurmisingASprintersSpeed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double maxSpeed = 0;
        Map<Integer, Integer> dt = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            dt.put(input.nextInt(), input.nextInt());
        }
        ArrayList<Integer> times = new ArrayList<>(dt.keySet());
        for (int i = 0; i < times.size() - 1; i++) {
            maxSpeed = Math.max(maxSpeed, (double) Math.abs((dt.get(times.get(i + 1)) - dt.get(times.get(i)))) / (times.get(i + 1) - times.get(i)));
        }
        System.out.printf("%.1f", maxSpeed);
    }
}
