package ccc;

import java.util.*;
public class CCC07J4AnagramChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] sentence1 = input.nextLine().replace(" ", "").toCharArray();
        char[] sentence2 = input.nextLine().replace(" ", "").toCharArray();
        Arrays.sort(sentence1);
        Arrays.sort(sentence2);
        if (Arrays.equals(sentence1, sentence2)) System.out.println("Is an anagram.");
        else System.out.println("Is not an anagram.");
    }
}