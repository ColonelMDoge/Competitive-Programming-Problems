package ccc;

import java.util.Arrays;
import java.util.Scanner;

public class CCC17S2HighTideLowTide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] measurements = new int[input.nextInt()];
        int division = (int) Math.round(measurements.length / 2.0);
        for (int i = 0; i < measurements.length; i++) {
            measurements[i] = input.nextInt();
        }
        Arrays.sort(measurements);
        for (int i = 0; i < measurements.length / 2; i++) {
            System.out.printf("%d %d ", measurements[division - i - 1], measurements[division + i]);
        }
        if (measurements.length % 2 == 1) System.out.print(measurements[0]);
    }
}
