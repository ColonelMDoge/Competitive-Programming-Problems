package ccc;

import java.util.*;
import static java.lang.Integer.parseInt;
public class CCC20J3Art {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int drops = input.nextInt();
        input.nextLine();
        int[] xCoor = new int[drops];
        int[] yCoor = new int[drops];
        for (int i = 0; i < drops; i++) {
            String[] coords = input.nextLine().split(",");
            xCoor[i] = parseInt(coords[0]);
            yCoor[i] = parseInt(coords[1]);
        }
        Arrays.sort(xCoor);
        Arrays.sort(yCoor);
        String bottomLeft = (xCoor[0] - 1) + "," + (yCoor[0] - 1);
        String upperRight = (xCoor[drops - 1] + 1) + "," + (yCoor[drops - 1] + 1);
        System.out.println(bottomLeft);
        System.out.println(upperRight);
    }
}
