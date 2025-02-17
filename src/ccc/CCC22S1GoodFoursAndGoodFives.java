package ccc;

import java.util.Scanner;

public class CCC22S1GoodFoursAndGoodFives {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), combinations = 0;
        if (n % 5 == 0) combinations++;
        if (n % 4 == 0) combinations++;
        while(n > 0) {
            n -= 4;
            if (n % 5 == 0 && n > 0) combinations++;
        }
        System.out.println(combinations);
    }
}
