package ccc;
import java.util.Scanner;
public class CCC23S1Trianglane {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int triangles = input.nextInt();
        input.nextLine();
        String[] firstRow = input.nextLine().split(" ");
        String[] secondRow = input.nextLine().split(" ");
        int sides = 0;
        for (int i = 0; i < triangles; i++) {
            if (firstRow[i].equals("1")) sides += 3;
            if (secondRow[i].equals("1")) sides += 3;
        }
        for (int i = 0; i < triangles - 1; i++) {
            if (firstRow[i].equals("1") && firstRow[i + 1].equals("1")) sides -= 2;
            if (secondRow[i].equals("1") && secondRow[i + 1].equals("1")) sides -= 2;
        }
        for (int i = 0; i < triangles; i+=2) {
            if (firstRow[i].equals("1") && firstRow[i].equals(secondRow[i])) sides-= 2;
        }
        System.out.println(sides);
    }
}
