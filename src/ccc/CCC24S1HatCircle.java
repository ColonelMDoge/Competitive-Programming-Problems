package ccc;

import java.util.Scanner;
public class CCC24S1HatCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[input.nextInt()];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < numbers.length / 2; i++) {
            if (numbers[i] == numbers[numbers.length / 2 + i])  sum += 2;
        }
        System.out.println(sum);
    }
}
