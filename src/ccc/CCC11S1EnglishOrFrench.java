package ccc;

import java.util.Scanner;

public class CCC11S1EnglishOrFrench {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lines = input.nextInt(), t = 0, s = 0;
        for (int i = 0; i < lines; i++) {
            String sentence = input.nextLine();
            t += (int) sentence.chars().filter(e -> e == 't'|| e == 'T').count();
            s += (int) sentence.chars().filter(e -> e == 's' || e == 'S').count();
        }
        if (t >= s) System.out.println("English");
        else System.out.println("French");
    }
}
