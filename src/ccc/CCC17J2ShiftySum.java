package ccc;

import java.util.Scanner;
public class CCC17J2ShiftySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int shifterNumber = input.nextInt();
        int shift = 10;
        int total = number;
        for (int x = 0; x < shifterNumber; x++) {
            total += number * shift;
            shift *= 10;
        }
        System.out.println(total);
    }
}
