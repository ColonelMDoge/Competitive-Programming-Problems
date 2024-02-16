package ccc;

import java.util.Scanner;
public class CCC12J3IconScaling
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int scale = input.nextInt();
        String[][] icon = {{"*","x","*"},{" ","x","x"},{"*"," ","*"}};

        for (int x = 0; x < scale * 3; x++) {
            for (int y = 0; y < 3; y++) {
                for (int z = 0; z < scale; z++) {
                    System.out.print(icon[x / scale][y]);
                }
            }
        }
    }
}