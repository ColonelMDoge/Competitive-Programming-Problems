package ccc;

import java.util.Scanner;
public class CCC00S1SlotMachines {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short coins = input.nextShort();
        int rounds = 0;
        byte a = input.nextByte(), b = input.nextByte(), c = input.nextByte();
        while (true) {
            rounds++;
            coins--;
            a++;
            if (a % 35 == 0) {
                coins += 30;
                a = 0;
            }
            if (coins <= 0) break;
            rounds++;
            coins--;
            b++;
            if (b % 100 == 0) {
                coins += 60;
                b = 0;
            }
            if (coins <= 0) break;
            rounds++;
            coins--;
            c++;
            if (c % 10 == 0) {
                coins += 9;
                c = 0;
            }
            if (coins <= 0) break;
        }
        System.out.printf("Martha plays %d times before going broke.", rounds);
    }
}
