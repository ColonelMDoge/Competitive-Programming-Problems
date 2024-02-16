package ccc;

import java.util.Scanner;
public class CCC18J1TelemarketerOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d1 = input.nextInt();
        int d2 = input.nextInt();
        int d3 = input.nextInt();
        int d4 = input.nextInt();
        if (d1 == 8 || d1 == 9) {
            if (d4 == 8 || d4 == 9) {
                if (d2 == d3) {
                    System.out.println("ignore");
                } else {
                    System.out.println("answer");
                }
            } else {
                System.out.println("answer");
            }
        } else {
            System.out.println("answer");
        }
    }
}
