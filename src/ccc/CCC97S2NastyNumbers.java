package ccc;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC97S2NastyNumbers {
    public static void nasty(int num, ArrayList<Integer> sums, ArrayList<Integer> diffs) {
        for (int sum : sums) {
            for (int diff : diffs) {
                if (sum == diff) {
                    System.out.println(num + " is nasty");
                    return;
                }
            }
        }
        System.out.println(num + " is not nasty");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int number = input.nextInt();
            ArrayList<Integer> sums = new ArrayList<>();
            ArrayList<Integer> diff = new ArrayList<>();
            sums.add(number + 1);
            diff.add(number - 1);
            for (int j = 2; j <= (int)Math.sqrt(number); j++) {
                if (number % j == 0) {
                    sums.add(number / j + j);
                    diff.add(number / j - j);
                }
            }
            nasty(number, sums, diff);
        }
    }
}
