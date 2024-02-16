package ccc;

import java.util.*;
public class CCC19S1Flipper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sequence = input.nextLine();
        int[] grid = {1,2,3,4};

        for (int i = 0; i < sequence.length(); i++) {
            char flipper = sequence.charAt(i);
            if (flipper == 'H') {
                int n = grid[0];
                int n1 = grid[1];
                int n2 = grid[2];
                int n3 = grid[3];
                grid[0] = n2;
                grid[1] = n3;
                grid[2] = n;
                grid[3] = n1;
            } else if (flipper == 'V') {
                int v = grid[0];
                int v1 = grid[1];
                int v2 = grid[2];
                int v3 = grid[3];
                grid[0] = v1;
                grid[1] = v;
                grid[2] = v3;
                grid[3] = v2;
            }
        }
        System.out.print(grid[0]);
        System.out.print(" " + grid[1]);
        System.out.println();
        System.out.print(grid[2]);
        System.out.print(" " + grid[3]);
    }
}
