package ccc;

import java.util.Scanner;
public class CCC17J1QuadrantSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int coord1 = input.nextInt();
        int coord2 = input.nextInt();
        if(coord1 > 0 && coord2 > 0) {
            System.out.println(1);
        } else if(coord1 < 0 && coord2 > 0) {
            System.out.println(2);
        } else if(coord1 < 0 && coord2 < 0) {
            System.out.println(3);
        } else if(coord1 > 0 && coord2 < 0) {
            System.out.println(4);
        }
    }
}
