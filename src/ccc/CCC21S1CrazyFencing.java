package ccc._2021;

import java.util.Scanner;

public class CCC21S1CrazyFencing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double area = 0;
        int[] heights = new int[n + 1];
        int[] widths = new int[n];
        for (int i = 0; i < n + 1; i++) {
            heights[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            widths[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            area += ((heights[i] + heights[i+1]) * widths[i]) / 2.0;
        }
        System.out.printf("%.1f", area);
    }
}
