package ccc;

import java.util.Scanner;

public class CCC24J5HarvestWaterloo {
    static int sum = 0;
    public static void expandOutward(char[][] field, int row, int col) {
        if (row > field.length - 1 || row < 0 || col > field[0].length - 1|| col < 0 || field[row][col] == '*') return;
        if (field[row][col] == 'L') sum += 10;
        if (field[row][col] == 'M') sum += 5;
        if (field[row][col] == 'S') sum += 1;
        field[row][col] = '*';
        expandOutward(field, row + 1, col);
        expandOutward(field, row - 1, col);
        expandOutward(field, row, col + 1);
        expandOutward(field, row, col - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] field = new char[input.nextInt()][input.nextInt()];
        for (int i = 0; i < field.length; i++) {
            field[i] = input.next().toCharArray();
        }
        int startRow = input.nextInt();
        int startCol = input.nextInt();
        expandOutward(field, startRow, startCol);
        System.out.println(sum);
    }
}
