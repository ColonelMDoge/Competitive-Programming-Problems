package ccc;

import java.util.HashSet;
import java.util.Scanner;

public class CCC13S1From1987To2013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt() + 1;
        HashSet<Character> dupes = new HashSet<>();
        while(true) {
            for (char c : String.valueOf(start).toCharArray()) dupes.add(c);
            if (dupes.size() == String.valueOf(start).length()) {
                 System.out.println(start);
                 break;
            } else {
                start++;
                dupes.clear();
            }
        }
    }
}
