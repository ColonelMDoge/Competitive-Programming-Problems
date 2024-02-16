package ccc;

import java.util.Scanner;
public class CCC19J2TimeToDecompress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int L = input.nextInt();
        for (int x = 0; x < L; x++) {
            int N = input.nextInt();
            String output = input.next();
            for (int y = 0; y < N; y++) {
                System.out.print(output);
            }
            System.out.println();
        }
    }
}
