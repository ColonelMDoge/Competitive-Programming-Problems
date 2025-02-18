package ccc;

import java.util.Arrays;
import java.util.Scanner;

public class CCC16S2TandemBicycle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int question = input.nextInt(), people = input.nextInt(), total = 0;
        int[] dmoj = new int[people], peg = new int[people];
        for (int i = 0; i < people; i++) {
            dmoj[i] = input.nextInt();
        }
        for (int i = 0; i < people; i++) {
            peg[i] = input.nextInt();
        }
        Arrays.sort(dmoj);
        Arrays.sort(peg);
        if (question == 1) {
            for (int i = 0; i < people; i++) {
                total += Math.max(dmoj[i], peg[i]);
            }
        } else {
            for (int i = 0; i < people; i++) {
                total += Math.max(dmoj[i], peg[people - 1 - i]);
            }
        }
        System.out.println(total);
    }
}
