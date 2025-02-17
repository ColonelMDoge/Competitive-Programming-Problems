package ccc;

import java.util.Scanner;

public class CCC09S1CoolNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int from = input.nextInt(), to = input.nextInt(), cool = 0;
        for (int i = from; i <= to; i++) {
            double square = Math.sqrt(i);
            double cube = Math.cbrt(i);
            if (square - (int) square == 0 && cube - (int) cube == 0) cool++;
        }
        System.out.println(cool);
    }
}
