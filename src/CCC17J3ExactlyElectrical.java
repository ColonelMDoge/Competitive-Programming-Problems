package ccc;

import java.util.Scanner;

public class CCC17J3ExactlyElectrical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt(), y1 = input.nextInt(), x2 = input.nextInt(), y2 = input.nextInt();
        int distance = Math.abs(x2 - x1) + Math.abs(y2 - y1);
        int energy = input.nextInt();
        // editorial says energy remaining after distance travelled must be positive even number
        if (distance <= energy && (energy - distance) % 2 == 0) System.out.println("Y");
        else System.out.println("N");
    }
}
