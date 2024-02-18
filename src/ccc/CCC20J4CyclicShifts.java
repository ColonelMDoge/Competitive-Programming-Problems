package ccc;
import java.util.Scanner;
public class CCC20J4CyclicShifts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phrase = input.nextLine();
        String cycler = input.nextLine();
        for (int i = 0; i < cycler.length(); i++) {
            if (phrase.contains(cycler)) {
                System.out.println("yes");
                return;
            } else cycler = cycler.substring(1) + cycler.charAt(0);
        }
        System.out.println("no");
    }
}