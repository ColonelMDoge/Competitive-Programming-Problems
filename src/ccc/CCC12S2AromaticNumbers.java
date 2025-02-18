package ccc;

import java.util.HashMap;
import java.util.Scanner;

public class CCC12S2AromaticNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Character, Integer> numerals = new HashMap<>();
        numerals.put('I', 1);
        numerals.put('V', 5);
        numerals.put('X', 10);
        numerals.put('L', 50);
        numerals.put('C', 100);
        numerals.put('D', 500);
        numerals.put('M', 1000);
        String aromatic = input.next();
        int total = Character.getNumericValue(aromatic.charAt(aromatic.length() - 2)) * numerals.get(aromatic.charAt(aromatic.length()-1));
        for (int i = 1; i < aromatic.length() - 1; i += 2) {
            int numeral1 = numerals.get(aromatic.charAt(i)), numeral2 = numerals.get(aromatic.charAt(i+2));
            int total1 = Character.getNumericValue(aromatic.charAt(i - 1)) * numeral1;
            if (numeral1 < numeral2) total -= total1;
            else total += total1;
        }
        System.out.println(total);
    }
}
