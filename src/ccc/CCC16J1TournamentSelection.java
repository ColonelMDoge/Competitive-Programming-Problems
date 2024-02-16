package ccc;

import java.util.Scanner;
public class CCC16J1TournamentSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int wins = 0;
        for (int x = 0; x < 6; x++) {
            String round = input.nextLine();
            if (round.equals("W")) {
                wins++;
            }
        }
        if (wins > 4) {
            System.out.println(1);
        } else if (wins > 2) {
            System.out.println(2);
        } else if (wins > 0) {
            System.out.println(3);
        } else {
            System.out.println(-1);
        }
    }
}
