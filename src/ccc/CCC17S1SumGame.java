package ccc;

import java.util.Scanner;

public class CCC17S1SumGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int games = input.nextInt();
        short[] swifties = new short[games];
        short[] semaphores = new short[games];
        for (int i = 0; i < games; i++) {
            swifties[i] = input.nextShort();
        }
        for (int i = 0; i < games; i++) {
            semaphores[i] = input.nextShort();
        }
        int game = 0, swiftSum = 0, semaphoreSum = 0;
        for (int i = 0; i < games; i++) {
            swiftSum += swifties[i];
            semaphoreSum += semaphores[i];
            if (swiftSum == semaphoreSum) game = i + 1;
        }
        System.out.println(game);
    }
}
