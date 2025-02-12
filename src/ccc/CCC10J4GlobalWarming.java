package ccc;

import java.util.Arrays;
import java.util.Scanner;

public class CCC10J4GlobalWarming {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        while (num != 0) {
            int[] temps = new int[num];
            for (int i = 0; i < temps.length; i++) {
                temps[i] = input.nextInt();
                if (i > 0) temps[i-1] = temps[i] - temps[i - 1];
            }
            temps = Arrays.copyOfRange(temps, 0, temps.length - 1);
            if (temps.length == 0) {
                System.out.println(0);
                num = input.nextInt();
                continue;
            }
            int[] extracted = getInts(temps);
            System.out.println(extracted.length);
            num = input.nextInt();
        }
    }
    private static int[] getInts(int[] temps) {
        int n = 1;
        int[] extracted = Arrays.copyOfRange(temps,0, n);
        int oPointer = 0, ePointer = 0;
        while (oPointer < temps.length) {
            if (ePointer > extracted.length - 1) ePointer = 0;
            if (extracted[ePointer] == temps[oPointer]) {
                oPointer++;
                ePointer++;
            } else {
                oPointer = 0;
                ePointer = 0;
                n++;
                extracted = Arrays.copyOfRange(temps,0, n);
            }
        }
        return extracted;
    }
}
