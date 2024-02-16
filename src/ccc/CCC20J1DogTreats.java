package ccc;

import java.util.Scanner;
public class CCC20J1DogTreats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int smallTreats = input.nextInt();
        int mediumTreats = input.nextInt();
        int largeTreats = input.nextInt();
        int happinessScore = 1 * smallTreats + 2 * mediumTreats + 3 * largeTreats;
        if (happinessScore < 10) {
            System.out.println("sad");
        } else {
            System.out.println("happy");
        }
    }
}
