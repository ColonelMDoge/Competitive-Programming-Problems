package ccc;

import java.util.Scanner;
public class CCC18J2OccupyParking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cars = input.nextInt();
        input.nextLine();
        String yesterday = input.nextLine();
        String today = input.nextLine();
        int sum = 0;
        for (int x = 0; x < cars; x++) {
            if(yesterday.charAt(x) == 'C' && today.charAt(x) == 'C') {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
