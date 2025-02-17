package ccc;

import java.util.Scanner;

public class CCC16S1Ragaman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next(), wildcard = input.next();
        int starCount = 0, missingChars = 0;
        char[] wordCount = new char[26], wildCount = new char[26];
        for (char c : word.toCharArray()) {
            wordCount[c-97]++;
        }
        for (char c : wildcard.toCharArray()) {
            if (c == '*') {
                starCount++;
                continue;
            }
            wildCount[c-97]++;
        }
        for (int i = 0; i < 26; i++) {
            if (wordCount[i] == 0 && wildCount[i] == 0) continue;
            if(wordCount[i] == wildCount[i]) continue;
            if (wildCount[i] < wordCount[i]) missingChars += wordCount[i] - wildCount[i];
        }
        if (missingChars == starCount) System.out.println("A");
        else System.out.println("N");
    }
}
