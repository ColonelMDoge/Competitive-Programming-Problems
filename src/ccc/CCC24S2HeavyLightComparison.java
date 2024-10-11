package ccc;

import java.util.Scanner;

public class CCC24S2HeavyLightComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int lmaoUnused = input.nextInt();
        for (int i = 0; i < rows; i++) {
            StringBuilder heavyLetters = new StringBuilder();
            StringBuilder lightLetters = new StringBuilder();
            String phrase = input.next();
            for (char c : phrase.toCharArray()) {
                if (heavyLetters.toString().contains(String.valueOf(c))) continue;
                if (!lightLetters.toString().contains(String.valueOf(c))) lightLetters.append(c);
                else {
                    heavyLetters.append(c);
                    lightLetters.deleteCharAt(lightLetters.indexOf(String.valueOf(c)));
                }
            }
            if (lightLetters.toString().contains(String.valueOf(phrase.charAt(0)))) bruh(lightLetters, heavyLetters, phrase);
            else bruh(heavyLetters, lightLetters, phrase);
        }
    }
    private static void bruh(StringBuilder lightLetters, StringBuilder heavyLetters, String phrase) {
        for (int i = 1; i < phrase.length(); i++) {
            if (i % 2 != 0 && !heavyLetters.toString().contains(String.valueOf(phrase.charAt(i)))) {
                System.out.println("F");
                return;
            } else if (i % 2 == 0 && !lightLetters.toString().contains(String.valueOf(phrase.charAt(i)))) {
                System.out.println("F");
                return;
            }
        }
        System.out.println("T");
    }
}
