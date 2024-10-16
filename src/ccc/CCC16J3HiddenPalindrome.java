package ccc;

import java.util.Scanner;
public class CCC16J3HiddenPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.next();
        String longest = "";
        for (int i = 0; i < sentence.length(); i++) {
            for (int j = 0; j < sentence.length() - i; j++) {
                StringBuilder stringBuilder = new StringBuilder(sentence.substring(j,j + i + 1));
                if (stringBuilder.toString().contentEquals(stringBuilder.reverse())) longest = String.valueOf(stringBuilder);
            }
        }
        System.out.println(longest.length());
    }
}