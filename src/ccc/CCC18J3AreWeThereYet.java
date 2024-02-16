package ccc;

import java.util.Scanner;
public class CCC18J3AreWeThereYet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d[] = new int[4]; // creates the input that allows 4 spaces only
        int c[] = new int[5]; // creates cities that allows 5 spaces only
        for (int i = 0; i < 4; i++) { // loop from index 0 to 4
            d[i] = input.nextInt(); // gets input 4 times and sticks it into array
        }
        c[0] = 0; // index of 0 is 0
        for (int x=1; x < 5; x++) { // loops through index 1 to 4
            c[x] = c[x-1] + d[x-1]; // the index inside is equal to that minus one plus the distance of that minus 1
        } // c[1] = c[0] + d[0] which is 3
        for (int x =0; x<5; ++x) {
            for (int y = 0; y<5; ++y) {
                int r = c[y] - c[x]; // each number is equal to
                // index value of city[y] - city[x]
                if (r<0) r*= -1; // if r is less than 0 than u make it positive
                System.out.print(r);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
