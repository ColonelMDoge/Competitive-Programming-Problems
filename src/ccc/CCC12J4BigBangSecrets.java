package ccc;

import java.util.Scanner;
public class CCC12J4BigBangSecrets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        String banger = input.next();
        for (int i = 0; i < banger.length(); i++) {
            int s = 3 * (i + 1) + k;
            char c =  banger.charAt(i) - s < 65 ? (char) (90 - 65 % (banger.charAt(i) - s) + 1) : (char) (banger.charAt(i) - s);
            System.out.print(c);
        }
    }
}
