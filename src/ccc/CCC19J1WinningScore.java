package ccc;

import java.util.Scanner;
public class CCC19J1WinningScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int apples3 = input.nextInt();
        int apples2 = input.nextInt();
        int apples1 = input.nextInt();
        int bananas3 = input.nextInt();
        int bananas2 = input.nextInt();
        int bananas1 = input.nextInt();
        int applePoints = (apples3 * 3) + (apples2 * 2) + apples1;
        int bananaPoints = (bananas3 * 3) + (bananas2 * 2) + bananas1;
        if (applePoints > bananaPoints) {
            System.out.println("A");
        }
        else if (bananaPoints > applePoints) {
            System.out.println("B");
        }
        else {
            System.out.println("T");
        }
    }
}
