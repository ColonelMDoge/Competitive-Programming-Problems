package ccc;

import java.util.Scanner;

public class CCC07S1FederalVotingAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int people = input.nextInt();
        for (int i = 0; i < people; i++) {
            int year = input.nextInt(), month = input.nextInt(), date = input.nextInt();
            if (year < 1989) System.out.println("Yes");
            else if (year > 1989) System.out.println("No");
            else if (month > 2) System.out.println("No");
            else if (month < 2) System.out.println("Yes");
            else {
                if (date <= 27) System.out.println("Yes");
                else System.out.println("No");
            }
        }
    }
}
